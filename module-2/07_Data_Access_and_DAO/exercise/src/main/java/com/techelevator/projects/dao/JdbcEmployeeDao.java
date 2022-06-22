package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = new ArrayList<>();

		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee;";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

		while (rowSet.next()) {
			Employee employee = mapRowToEmployee(rowSet);
			employeeList.add(employee);
		}
		return employeeList;
	}

	private Employee mapRowToEmployee(SqlRowSet rowSet) {
		Employee employee = new Employee();

		int employeeId = rowSet.getInt("employee_id");
		employee.setId(employeeId);
		int departmentId = rowSet.getInt("department_id");
		employee.setDepartmentId(departmentId);
		String firstName = rowSet.getString("first_name");
		employee.setFirstName(firstName);
		String lastName = rowSet.getString("last_name");
		employee.setLastName(lastName);
		java.sql.Date birthDate = rowSet.getDate("birth_date");
		if (birthDate != null) {
			employee.setBirthDate(birthDate.toLocalDate());
		}
		java.sql.Date hireDate = rowSet.getDate("hire_date");
		if (hireDate != null) {
			employee.setHireDate(hireDate.toLocalDate());
		}
		return employee;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> searchList = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee WHERE first_name ILIKE ? AND last_name ILIKE ?;";
		String firstName = "%" + firstNameSearch + "%";
		String lastName = "%" + lastNameSearch + "%";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, firstName, lastName);

		while (rowSet.next()) {
			Employee employee = mapRowToEmployee(rowSet);
			searchList.add(employee);
		}

		return searchList;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> projectList = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee " +
				"JOIN project_employee USING (employee_id) " +
				"WHERE project_id = ?;";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, projectId);
		while (rowSet.next()) {
			Employee employee = mapRowToEmployee(rowSet);
			projectList.add(employee);
		}
		return projectList;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sql = "INSERT INTO project_employee VALUES (?, ?);";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?;";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> projectlessList = new ArrayList<>();
		String sql = "SELECT employee_id, department_id, first_name, last_name, birth_date, hire_date FROM employee " +
				"WHERE department_id IS NULL;";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);
		while (rowSet.next()) {
			Employee employee = mapRowToEmployee(rowSet);
			projectlessList.add(employee);
		}
		return projectlessList;
	}


}

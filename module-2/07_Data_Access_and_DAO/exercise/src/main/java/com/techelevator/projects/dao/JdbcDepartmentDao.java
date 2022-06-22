package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {
	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(int id) {
		Department department = null;
		String sql = "SELECT department_id, name FROM department WHERE department_id = ?;";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, id);

		if (rowSet.next()) {
			department = mapRowToDepartment(rowSet);
		}
		return department;
	}

	private Department mapRowToDepartment(SqlRowSet rowSet) {
		Department department = new Department();

		int departmentId = rowSet.getInt("department_id");
		department.setId(departmentId);

		String name = rowSet.getString("name");
		department.setName(name);

		return department;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departmentList = new ArrayList<>();

		String sql = "SELECT department_id, name FROM department;";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

		while (rowSet.next()) {
			Department department = mapRowToDepartment(rowSet);
			departmentList.add(department);
		}
		return departmentList;
	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
		String sql = "UPDATE department SET name = ? WHERE department_id = ?;";
		jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());

	}

}

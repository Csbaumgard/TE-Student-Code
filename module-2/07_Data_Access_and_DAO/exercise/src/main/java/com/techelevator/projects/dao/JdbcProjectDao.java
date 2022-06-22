package com.techelevator.projects.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project project = null;

		// Write and execute query
		String sql = "SELECT project_id, name, from_date, to_date FROM project WHERE project_id = ?;";

		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, projectId);

		//Process results
		if (rowSet.next()) {
			project = mapRowtoProject(rowSet);
		}

		return project;
	}

	private Project mapRowtoProject(SqlRowSet rowSet) {
		Project project = new Project();

		int projectId = rowSet.getInt("project_id");
		project.setId(projectId);

		String name = rowSet.getString("name");
		project.setName(name);

		java.sql.Date fromDate = rowSet.getDate("from_date");
		if (fromDate != null) {
			project.setFromDate(fromDate.toLocalDate());
		}

		java.sql.Date toDate = rowSet.getDate("to_date");
		if (toDate != null) {
			project.setToDate(toDate.toLocalDate());
		}
		return project;
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> projectList = new ArrayList<>();

		String sql = "SELECT project_id, name, from_date, to_date FROM project";
		SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql);

		while (rowSet.next()) {
			Project project = mapRowtoProject(rowSet);
			projectList.add(project);
		}
		return projectList;
	}

	@Override
	public Project createProject(Project newProject) {
		String sql = "INSERT INTO project VALUES (?, ?, ?, ?);";
		jdbcTemplate.update(sql, newProject.getId(), newProject.getName(), newProject.getFromDate(), newProject.getToDate());
		return newProject;
	}

	@Override
	public void deleteProject(int projectId) {
		String sql = "ALTER TABLE project_employee " +
				"DROP CONSTRAINT fk_project_employee_project; " +
				"DELETE FROM project WHERE project_id = ?;";
		jdbcTemplate.update(sql, projectId);
	}
	

}

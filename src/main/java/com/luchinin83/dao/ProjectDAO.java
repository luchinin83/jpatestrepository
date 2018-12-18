package com.luchinin83.dao;

import com.luchinin83.entity.Project;

import java.sql.SQLException;
import java.util.List;

public interface ProjectDAO {

    void add(Project project) throws SQLException;

    List<Project> getAll() throws SQLException;

    Project getById(Long id) throws SQLException;

    void update(Project employee) throws SQLException;

    void remove(Project employee) throws SQLException;

}

package com.luchinin83.dao;

import com.luchinin83.entity.Project;

import java.util.List;

public interface ProjectDAO {

    void add(Project project);

    List<Project> getAll();

    Project getById(Long id);

    void update(Project employee);

    void remove(Project employee);

}

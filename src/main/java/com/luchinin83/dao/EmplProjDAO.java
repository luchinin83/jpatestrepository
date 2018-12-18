package com.luchinin83.dao;

import com.luchinin83.entity.EmplProj;

import java.sql.SQLException;
import java.util.List;

public interface EmplProjDAO {

    void add(EmplProj emplProj) throws SQLException;

    List<EmplProj> getAll() throws SQLException;

    EmplProj getByEmployeeIdAndProjectId(Long employeeId, Long projectId);

    void update(EmplProj emplProj) throws SQLException;

    void remove(EmplProj emplProj) throws SQLException;

}


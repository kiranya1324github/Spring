package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

public interface DepartmentService {

	Department saveDepartment(Department department);

	List<Department> fetchDepartmentList();

  public void deleteDepartmentById(Long did) throws DepartmentNotFoundException;

	Department updateDepartment(Long did, Department department) throws DepartmentNotFoundException;

    public	Department fetchDepartmentById(Long did) throws DepartmentNotFoundException, DepartmentNotFoundException;

	Department fetchDepartmentByName(String dname) throws DepartmentNotFoundException;

	Department fetchDepartmentByCode(String dcode);

	
	
}

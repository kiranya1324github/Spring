package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Department;

public interface DepartmentRepository  extends JpaRepository<Department,Long>{

public	Department findByDepartmentName(String dname);

public Department findByDepartmentCode(String dcode);

	
}

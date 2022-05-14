package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

import com.example.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	
@Autowired
DepartmentService departmentService;
@PostMapping("/departments/")
public Department saveDepartment(@RequestBody Department department) {
	return departmentService.saveDepartment(department);
}
	@GetMapping("/departments/")
	public List<Department> fetchDepartmentList(){
		return  departmentService.fetchDepartmentList();
	
	}
	//get the record by id
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException {
	return departmentService.fetchDepartmentById(did);
	
	
		 
	}

	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentByName(@PathVariable("name") String dname) throws DepartmentNotFoundException {
		return departmentService.fetchDepartmentByName(dname);
	}

	@GetMapping("/departments/code/{code}")
	public Department fetchDepartmentByCode(@PathVariable("code")String dcode) throws DepartmentNotFoundException  {
		return departmentService.fetchDepartmentByCode(dcode);
	}
	
	
	
	
	
	@DeleteMapping("/departments/{id}")
		public String deleteDepartmentById(@PathVariable("id") Long did) throws DepartmentNotFoundException{
			departmentService.deleteDepartmentById(did);
			return "Department is deleted";
		}
			
	//update record
	  @PutMapping("/departments/{id}")
	  
	  public Department updateDepartment(@PathVariable ("id") Long did, @RequestBody Department department) throws DepartmentNotFoundException{
		  
		  return departmentService.updateDepartment(did,department);
	  }

	

		}

	

	









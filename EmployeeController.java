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


import com.example.demo.entity.Employee;

import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employees/save/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
    @GetMapping("/employees/getall/")
    public List<Employee> fetchEmployeeList(){
		return  employeeService.fetchEmployeeList();
	
	}
  //get the record by id
  	@GetMapping("/employees/{id}")
  	public Employee fetchEmployeeById(@PathVariable("id") Long eid)  {
  	return employeeService.fetchEmployeeById(eid);
  	
    
  	}
  	@GetMapping("/employees/name/{name}")
	public Employee fetchDepartmentByName(@PathVariable("name") String ename)  {
		return employeeService.fetchEmployeeByName(ename);
	}
  	
  	@GetMapping("/employees/salary/{salary}")
  	public Employee fetchEmployeeBySalary(@PathVariable("salary")float esalary) {
  		return employeeService.fetchEmployeeBySalary(esalary);
  	}
  	
  	@GetMapping("/employees/age/{age}")
  	public Employee fetchEmployeeByAge(@PathVariable("age")int eage) {
  		return employeeService.fetchEmployeeByAge(eage);
  	}
  	
  	@GetMapping("/employees/mobile/{mobileno}")
  	public Employee fetchEmployeeByMobileNo(@PathVariable("mobileno")float emobno) {
  		return employeeService.fetchEmployeeByMobileNo(emobno);
  	}
  	
  	
  	
  	
  	@DeleteMapping("/employees/delete/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long eid) {
		employeeService.deleteEmployeeById(eid);
		return "Employee is deleted";
	}
  	
  	
  	
  	
  	
  	
  	
  	
  	@PutMapping("/employees/update/{id}")
	  
	  public void updateEmployee(@PathVariable ("id") Long eid, @RequestBody Employee employee) {
		  
		   employeeService.updateEmployee(eid,employee);
	  }

}



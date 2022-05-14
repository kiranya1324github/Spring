package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	List<Employee> fetchEmployeeList();

	Employee fetchEmployeeById(Long id);

	Employee fetchEmployeeByName(String ename);

     void deleteEmployeeById(Long id);

	Employee updateEmployee(Long eid, Employee employee);

	Employee fetchEmployeeBySalary(float esalary);

	Employee fetchEmployeeByAge(int eage);

	Employee fetchEmployeeByMobileNo(float emobno);

	
}
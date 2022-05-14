package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;



@Repository

	public interface EmployeeRepository  extends JpaRepository<Employee,Long>{

	


	//public Employee save(Employee employee);

	//public List<Employee> findAll();

	public Employee findByEmployeeName(String ename);

	public Employee fetchEmployeeBySalary(float esalary);

	public Employee fetchEmployeeAge(int eage);

	public Employee fetchEmployeeByMobileno(float emobno);

	//public Employee deleteEmployeeById(Long eid);

	
	
}

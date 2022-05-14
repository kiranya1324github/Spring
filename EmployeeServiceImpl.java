package com.example.demo.service;




import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;



	@Service
	public class EmployeeServiceImpl implements EmployeeService {
		
		@Autowired
		EmployeeRepository employeeRepo;

		@Override
		public Employee saveEmployee(Employee employee) {
			// TODO Auto-generated method stub
			return employeeRepo.save(employee);
		}

		@Override
		public List<Employee> fetchEmployeeList() {
			// TODO Auto-generated method stub
			return employeeRepo.findAll();
		}

		@Override
		public Employee fetchEmployeeById(Long eid) {
			
			//return employeeRepo.findById(eid).get();
			return employeeRepo.findById(eid).get();
		}

		@Override
		public Employee fetchEmployeeByName(String ename) {
			// TODO Auto-generated method stub
			return employeeRepo.findByEmployeeName(ename);
		}

		@Override
		public void deleteEmployeeById(Long eid) {
			// TODO Auto-generated method stub
			
			  employeeRepo.deleteById(eid);
        }

		@Override
		public Employee updateEmployee(Long eid, Employee employee) {
			Optional<Employee> employee1= employeeRepo.findById(eid);
		Employee empDB=null;
			if(employee1.isPresent()) {
			 empDB=	employeeRepo.findById(eid).get();
			if(Objects.nonNull(employee.getEmployeeName()) && !"".equalsIgnoreCase(employee.getEmployeeName())) {
				empDB.setEmployeeName(employee.getEmployeeName());
				
			}
			if(Objects.nonNull(employee.getEmployeeAge()) && !"".equals(employee.getEmployeeAge())) {
				empDB.setEmployeeAge(employee.getEmployeeAge());
				System.out.println(employee.getEmployeeAge());
			}
			if(Objects.nonNull(employee.getEmployeeSalary()) && !"".equals(employee.getEmployeeSalary())) {
				empDB.setEmployeeSalary(employee.getEmployeeSalary());
				System.out.println(employee.getEmployeeSalary());
			}
			
			
			
		}
			return empDB;
		
		}
			
			

		@Override
		public Employee fetchEmployeeBySalary(float esalary) {
			// TODO Auto-generated method stub
			return employeeRepo.fetchEmployeeBySalary(esalary);
		}

		@Override
		public Employee fetchEmployeeByAge(int eage) {
			// TODO Auto-generated method stub
			return employeeRepo.fetchEmployeeAge(eage);
		}

		@Override
		public Employee fetchEmployeeByMobileNo(float emobno) {
			// TODO Auto-generated method stub
			return employeeRepo.fetchEmployeeByMobileno(emobno);
		}
		
		}

		
        
		
		
		
		
		
		



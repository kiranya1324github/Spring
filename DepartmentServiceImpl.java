package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;
import com.example.demo.repository.DepartmentRepository;



@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepo;
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepo.save(department);
		
	}
	@Override
	public List<Department> fetchDepartmentList() {
	
		// TODO Auto-generated method stub
	return departmentRepo.findAll();
		
	}
	@Override
	public void deleteDepartmentById(Long did)  throws DepartmentNotFoundException {
	
			// TODO Auto-generated method stub
			//check for null
			Optional<Department> department1= departmentRepo.findById(did);//check in database
	          if(!department1.isPresent()) {
	        	  throw new DepartmentNotFoundException("Department not available");
	          }
	          else {
			 departmentRepo.deleteById(did);
	          }
		}

		
	
 
		
		
	
	@Override
	public Department updateDepartment(Long did, Department department)  throws DepartmentNotFoundException {
		
			Optional<Department> department1= departmentRepo.findById(did);
			Department depDB=null;
			if(department1.isPresent()) {
			 depDB=	departmentRepo.findById(did).get();
			if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())) {
				depDB.setDepartmentName(department.getDepartmentName());
				
			}
			if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
				depDB.setDepartmentAddress(department.getDepartmentAddress());
				System.out.println(department.getDepartmentAddress());
			}
			if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())) {
				depDB.setDepartmentCode(department.getDepartmentCode());
				System.out.println(department.getDepartmentCode());
			}
			
			
			return departmentRepo.save(depDB);
	}
		
	        else {
		           throw new DepartmentNotFoundException("Department Not available");
	          }
	}


	
	@Override
	public Department fetchDepartmentById(Long did) throws DepartmentNotFoundException {
		Optional<Department> department1= departmentRepo.findById(did);//check in database
        if(!department1.isPresent()) {
      	  throw new DepartmentNotFoundException("Department not available");
        }
		return departmentRepo.findById(did).get();
	}

		
	@Override
	public Department fetchDepartmentByName(String dname) throws DepartmentNotFoundException {
	
			// TODO Auto-generated method stub
			return departmentRepo.findByDepartmentName(dname);
		}
	@Override
	public Department fetchDepartmentByCode(String dcode) {
		// TODO Auto-generated method stub
		return departmentRepo.findByDepartmentCode(dcode);
	}

		
	}
	
	
	
	
	
		
		
	

	
	
	
	
	
	
	
	
	

	
		
	
	
	
		

	




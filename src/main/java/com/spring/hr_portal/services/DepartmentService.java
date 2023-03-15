package com.spring.hr_portal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hr_portal.entities.Department;
import com.spring.hr_portal.repository.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo departmentRepo;
	
	public List<Department> findAllDepartment(){
		return departmentRepo.findAll();
		
	}
	
	

}

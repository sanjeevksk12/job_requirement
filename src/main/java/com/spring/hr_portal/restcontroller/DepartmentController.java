package com.spring.hr_portal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.entities.Department;
import com.spring.hr_portal.services.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping("/findAllDepartment")
	private List<Department> findAllDepartment(){
		return departmentService.findAllDepartment();
	}
	
	
	
	
	
}

package com.spring.hr_portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.hr_portal.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
	

}

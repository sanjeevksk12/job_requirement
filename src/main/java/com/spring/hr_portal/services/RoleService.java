package com.spring.hr_portal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hr_portal.entities.Role;
import com.spring.hr_portal.repository.RoleRepo;

@Service
public class RoleService {
	
	@Autowired
	private RoleRepo rolerepo;
	
	public List<Role> findAllRole(){
		return rolerepo.findAll();
	}
	
	public Role saverole(Role role) {
		return rolerepo.save(role);
	}
	

}

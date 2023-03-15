package com.spring.hr_portal.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.hr_portal.entities.Role;
import com.spring.hr_portal.services.RoleService;

@RestController
@RequestMapping("/api/v1")
public class RoleController {
	
	@Autowired
	private RoleService roleservice;
	
	@GetMapping("/findallrole")
	public List<Role> findAllRole(){
		return roleservice.findAllRole();
	}
	
	@PostMapping("/saverole")
	public Role saveRole(@RequestBody Role role) {
		return roleservice.saverole(role);
	}
	
}

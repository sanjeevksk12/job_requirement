package com.spring.hr_portal.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dept_id;
	private String departmentName;
	
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name = "fk")
	private List<Role> role;
	
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Role> getRole() {
		return role;
	}
	public void setRole(List<Role> role) {
		this.role = role;
	}
	public Department(int dept_id, String departmentName, List<Role> role) {
		super();
		this.dept_id = dept_id;
		this.departmentName = departmentName;
		this.role = role;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

package com.example.payroll;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String role;

	/**
	 * No args constructor for use in serialization
	 */
	public Employee() {
	}

	/**
	 * 
	 * @param id
	 * @param name
	 * @param role
	 */
	public Employee(Integer id, String name, String role) {
		this.id = id;
		this.name = name;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

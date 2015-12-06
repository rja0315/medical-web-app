package com.rja0315.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import antlr.collections.List;

@Entity
public class Role{
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String  name;

	@ManyToMany
	private java.util.List<User> users;
	

	public java.util.List<User> getUsers() {
		return users;
	}

	public void setUsers(java.util.List<User> users) {
		this.users = users;
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
	
	
}

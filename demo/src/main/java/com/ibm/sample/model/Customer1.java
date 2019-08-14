package com.ibm.sample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer1")
public class Customer1 {
	
	@Id
	private int id;
	private String name;
	private String Email;
	
	public Customer1() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", Email=" + Email + "]";
	}
	
	
}

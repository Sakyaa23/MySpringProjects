package com.ibm.sample.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.ibm.sample.model.Customer1;

public interface CustomerService {
	
	//Create
	public void createCustomer(List<Customer1> cst);
	
	//FindAll
	public Collection<Customer1> findAllCustomer();
	
	//FindById
	public Optional<Customer1> findCustomerById(int id);
	
	//Update
	public void updateCustomer(Customer1 cst);
	
	//DeleteById
	public void deleteCustomerById(int id);
	
	//DeleteAll
	public void deleteAllCustomer();
	
	

}

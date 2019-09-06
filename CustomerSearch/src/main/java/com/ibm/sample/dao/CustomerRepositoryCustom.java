package com.ibm.sample.dao;

import java.util.List;

import com.ibm.sample.model.Customer;

public interface CustomerRepositoryCustom {
	
	 List<Customer> getFirstNamesLike(String firstName);
	 
	 List<Customer> getLastNamesLike(String lastName);
	 
	 List<Customer> getBothNamesLike(String firstName, String lastName);

}

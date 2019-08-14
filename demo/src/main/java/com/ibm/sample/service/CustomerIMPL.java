package com.ibm.sample.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ibm.sample.dao.CustomerDAO;
import com.ibm.sample.model.Customer1;

public class CustomerIMPL implements CustomerService {
	
	@Autowired
	CustomerDAO cdao;
	
	@Override
	public void createCustomer(List<Customer1> cst) {
		 cdao.saveAll(cst);
	}

	@Override
	public Collection<Customer1> findAllCustomer() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

	@Override
	public Optional<Customer1> findCustomerById(int id) {
		// TODO Auto-generated method stub
		return cdao.findById(id);
	}

	@Override
	public void updateCustomer(Customer1 cst) {
		// TODO Auto-generated method stub
		cdao.save(cst);
	}

	@Override
	public void deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		cdao.deleteById(id);
	}

	@Override
	public void deleteAllCustomer() {
		// TODO Auto-generated method stub
		cdao.deleteAll();
		
	}

	
	
	
	

}

package com.ibm.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sample.dao.CustomerRepository;
import com.ibm.sample.model.Customer;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/test")
public class CustomerController {
	
	 @Autowired
	 private CustomerRepository customerRepository;
	 
	 @GetMapping("/customer")
	 public List<Customer> getTest() {
		 
		 return customerRepository.findAll();
		 
	   }
	 
	 @GetMapping("/customer/filter/firstName")
	 public List<Customer> getFilteredFisrtName(@RequestParam String firstName) {
		 
	     return customerRepository.getFirstNamesLike(firstName);
	     
	   }
	 
	 @GetMapping("/customer/filter/lastName")
	 public List<Customer> getFilteredLastName(@RequestParam String lastName) {
		 
	     return customerRepository.getLastNamesLike(lastName);
	     
	   }
	 
	 @GetMapping("/customer/filter/bothName")
	 public List<Customer> getFilteredAll(@RequestParam String firstName,String lastName) {
		 
	     return customerRepository.getBothNamesLike(firstName,lastName);
	     
	   }

}

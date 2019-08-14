package com.ibm.sample.controller;

import java.util.List;

//import org.hibernate.annotations.common.util.impl.Log_.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.sample.dao.CustomerDAO;
import com.ibm.sample.model.Customer1;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/test")
public class CustomerController {
	
	@Autowired
	CustomerDAO cstDao;
	
	@GetMapping("/getData")
	public List<Customer1> home() {
		List<Customer1> test=cstDao.findAll();
		System.out.println(test);
		return test;
		
	}
	/*@GetMapping(value= "/getbyid")
	public List<Customer> getAll() {
		//logger.debug("Getting customer with customer-id= {}.", id);
		return cstDao.findAll();
	}
	*/
	@RequestMapping("/hello")
	public String hello() {
		String hello = "hella";
		return hello;
		
	}
	
	@RequestMapping("/addCustomer")
	public String addCustomer(Customer1 cust) {
		System.out.println("inside submit");
		cstDao.save(cust);
		return "home.jsp";
		
		
	}
}

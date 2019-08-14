package com.ibm.sample.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.sample.model.Customer1;

@Repository
public interface CustomerDAO extends JpaRepository<Customer1, Integer>{

}

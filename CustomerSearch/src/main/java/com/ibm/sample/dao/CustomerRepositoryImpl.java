package com.ibm.sample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.sample.model.Customer;

import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional(readOnly=true)
public class CustomerRepositoryImpl implements CustomerRepositoryCustom{

	 @PersistenceContext
	    EntityManager entityManager;
	    
	    public List<Customer> getFirstNamesLike(String firstName) {
	        Query query = entityManager.createNativeQuery("SELECT em.* FROM springbootdb.customer as em " +
	                "WHERE em.firstname LIKE ?", Customer.class);
	        query.setParameter(1,"%"+ firstName + "%");
	        return query.getResultList();
	    }
	    
	    public List<Customer> getLastNamesLike(String lastName) {
	        Query query = entityManager.createNativeQuery("SELECT em.* FROM springbootdb.customer as em " +
	                "WHERE em.lastname LIKE ?", Customer.class);
	        query.setParameter(1,"%"+ lastName + "%");
	        return query.getResultList();
	    }
	    
	    public List<Customer> getBothNamesLike(String firstName, String lastName) {
	        Query query = entityManager.createNativeQuery("SELECT em.* FROM springbootdb.customer as em " +
	                "WHERE em.firstname LIKE ? and em.lastname LIKE ?", Customer.class);
	        query.setParameter(1,"%"+ firstName + "%");
	        query.setParameter(2,"%"+ lastName + "%");
	        return query.getResultList();
	    }
}

package com.fasoo.vuejs.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fasoo.vuejs.model.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByAge(int age);
}
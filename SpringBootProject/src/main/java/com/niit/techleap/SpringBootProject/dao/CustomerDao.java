package com.niit.techleap.SpringBootProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.techleap.SpringBootProject.model.Customer;

public interface CustomerDao extends JpaRepository<Customer,Integer> {

}

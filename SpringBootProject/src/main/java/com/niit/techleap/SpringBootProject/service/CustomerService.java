package com.niit.techleap.SpringBootProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.techleap.SpringBootProject.dao.CustomerDao;
import com.niit.techleap.SpringBootProject.model.Customer;
@Service
public class CustomerService {
	@Autowired
	CustomerDao dao;
	
	List<Customer> custList=new ArrayList<Customer>(); 
	public CustomerService()
	{
	
		
	}
	
	public List<Customer> getCustomers(){
		return dao.findAll();
	}
	
	/*public Customer getCustomer(int id)
	{
		custList.forEach(cust ->{
			if(cust.getCustID()==id)
				return cust;
		} 
		return null;
				);
	}*/
	
	public Optional<Customer> getCustomer(int id)
	{
		/*
		for(Customer cust:custList)
		{
			if(id==cust.getCustID())
			{
				return cust;
			}
		}
		return null;
		*/
		System.out.println(dao);
		Optional<Customer> cust=dao.findById(id);
		return cust;
	}
	
	/*
	public List<Customer> addCustomer(Customer custom)
	{
		//custom=new Customer(124,"nalla",28888.23);
		custList.add(custom);
		return custList;
	}
	*/
	
	public Customer addCustomer(Customer custom)
	{
		//custom=new Customer(124,"nalla",28888.23);
		dao.save(custom);
		return custom;
	}
	
	public List<Customer> deleteCustomer(int id)
	{
	/*
		for(Customer custom:custList)
	{
		if(id==custom.getCustID())
		{
			custList.remove(custom);
			return custList;
		}
	}
	return null;
	
		*/
		dao.deleteById(id);;
		return getCustomers(); 
	}

	public Customer updateCustomer(Customer customer, int id) {
		Optional<Customer> custOpt=dao.findById(id);
		dao.deleteById(id);
		dao.save(new Customer(id,customer.getBalance(),customer.getCustName()));
		return null;
	}
	
		
	
	
}

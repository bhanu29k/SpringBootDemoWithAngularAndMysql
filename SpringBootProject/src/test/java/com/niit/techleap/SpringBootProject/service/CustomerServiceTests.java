package com.niit.techleap.SpringBootProject.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.techleap.SpringBootProject.model.Customer;




//@Repository
//@DataJpaTest
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerServiceTests {
	@Autowired
	CustomerService sc;
	
	@Test
	public void context() {
	}
	
	@Test
	public void getCustomersTest()
	{
		Customer cust=sc.getCustomer(121).get();
		assertEquals(cust.getCustID(),121);
	}
	
	@Test
	public void addCustomersTest()
	{
		Customer customer=new Customer(1234,56383.23,"babu");
		Customer cust=sc.addCustomer(customer);
		assertEquals(cust.getCustID(),customer.getCustID());
	}
	
	@Test
	public void deleteCustomersTest()
	{

		List<Customer> cust=sc.deleteCustomer(1234);
		List<Customer> lcust=new ArrayList<Customer>();
		Customer c[]=new Customer[4];
		c[3]=new Customer(132,5678,"lala");
		c[2]=new Customer(125,4567,"lalu");
		c[1]=new Customer(121,12345,"Sonu");
		c[0]=new Customer(124,34567,"Dabbu");
		
		lcust.add(c[3]);
		lcust.add(c[2]);
		lcust.add(c[1]);
		lcust.add(c[0]);
		assertEquals(cust.size(),4);
		
	}
	
	
	
	
	
	
}

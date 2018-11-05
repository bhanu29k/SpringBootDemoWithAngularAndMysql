package com.niit.techleap.SpringBootProject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomerNotFound extends RuntimeException {

	public static final long serialversionUID=1L;
	
	public CustomerNotFound()
	{
		
	}
	
	public String toString()
	{
		return "customer not found exception occured";
		
	}
	
}

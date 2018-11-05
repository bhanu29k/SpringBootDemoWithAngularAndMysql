package com.niit.techleap.SpringBootProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProjectApplication.class, args);
		System.out.println("this is my first spring boot application");
		
		System.out.println("\nlist of beans created by spring boot\n");
		String beans[]=ctx.getBeanDefinitionNames();
		//System.out.println(beans.length);
		for(String bean:beans)
		{
			System.out.println(bean);
		}
		System.out.println("\n"+beans.length);
	}
}
 
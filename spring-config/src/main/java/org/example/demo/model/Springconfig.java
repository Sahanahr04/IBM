package org.example.demo.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="org.example.demo.model")//it replaces applicationContext file 
public class Springconfig {
	
	@Bean
	 public Employee employee()
	{
		 return new Employee(department());
	 }
	

	@Bean//bean is specifying here
	 public Department department() {//name of method is name of java class
		 return new Department(location());
	 }
	
	

	@Bean
	 public Location location()
	{
		 return new Location();
	 }

	

}

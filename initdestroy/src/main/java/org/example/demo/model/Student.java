package org.example.demo.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s") //default bean name student lower case
@Scope("prototype")// each time we get different object if this is not specified we get same 
@PropertySource(value="classpath:config.properties")
public class Student {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	private void initStudent()
	{
		System.out.println("inti method is called");//custom init method ,bean start this will be executed
	}
	
	@PreDestroy
	private void destroyStudent()
	{
		System.out.println("destroy method is called");//bean end  this will be executed,it is outside the context so execute will be not shown
	}
	@Override
	public String toString() {
		return "id=" + id + " name=" + name ;//this is specified only app alli data print
	}
	
	
	
}

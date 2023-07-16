package org.example.demo;
import java.util.Random;

import org.example.demo.model.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	
    	try {
    		/*ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		
    		Employee e=context.getBean("employee",Employee.class); 
    		Department d=context.getBean("department",Department.class); 
    		Location l=context.getBean("location",Location.class); 
    		  l.setLocationId(100);
			  l.setLocationName("Hyd"); 
			  l.setCountry("India"); 
			  d.setDepartmentId(101); 
			  d.setDepartmentName("Sales");
			  d.setLocation(l); 
			  e.setEmployeeId(new Random().nextInt(10000)); 
			  //e.setEmloyeeName("John Doe");
			  //e.setSalary(20000); 
			  e.setDepartment(d); 
			  System.out.println(e);//because of dependency it prints all by just specifying e
			  
			  Student student=context.getBean("s",Student.class);//overiding the default bean name
			  System.out.println(student);
			  Student student1=context.getBean("s",Student.class);
			  System.out.println(student1);
			  Student student3=context.getBean("s",Student.class);
			  System.out.println(student3);
			  System.out.println((student==student1 && student==student3));//all objects are same
			  */
    		
    		ApplicationContext context=new AnnotationConfigApplicationContext(Springconfig.class);
    		Student student=context.getBean("s",Student.class);
    		student.setId(1);
    		student.setName("sahana");
    		System.out.println(student);
    		
/*------------------------------------*/
    		Employee e=context.getBean("employee",Employee.class); 
    		System.out.println(e);
    		}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    
}

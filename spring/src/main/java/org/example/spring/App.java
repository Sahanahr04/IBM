package org.example.spring;
import org.example.spring.model.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	try
    	{
    		// ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    		Coach myCoach=context.getBean("theCoach",Coach.class);
    		System.out.println(myCoach.getDailyWorkOut());
    		System.out.println(myCoach.getDailyFortune());    		
    	}
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
    }
}

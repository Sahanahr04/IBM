package org.example.spring;
import org.example.spring.model.*;
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
    		BasketBallCoach bCoach=context.getBean("basketBallCoach",BasketBallCoach.class);
    		Cricketcoach cCoach=context.getBean("cricketcoach",Cricketcoach.class);
    		Happyfortuneservice hs=context.getBean("happyfortuneservice",Happyfortuneservice.class);
    		Sadfortuneservice ss=context.getBean("sadfortuneservice",Sadfortuneservice.class);
    		
    		System.out.println(bCoach);
    	}
   
    	
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
    }
}

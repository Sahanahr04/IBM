package org.example.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{

	private String bcoach_name ="david";
	 private Cricketcoach ccoach;
	 
	 @Autowired
	public BasketBallCoach(Cricketcoach ccoach) {
		
		this.ccoach = ccoach;
	}

	
	

	public String getBcoach_name() {
		return bcoach_name;
	}




	public void setBcoach_name(String bcoach_name) {
		this.bcoach_name = bcoach_name;
	}




	public Cricketcoach getCcoach() {
		return ccoach;
	}




	public void setCcoach(Cricketcoach ccoach) {
		this.ccoach = ccoach;
	}




	@Override
	public String toString() {
		return "bcoach_name=" + bcoach_name + " ccoach=" + ccoach ;
	}




	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practise nack volley ";
	
	}

	
	
	
	
	

}

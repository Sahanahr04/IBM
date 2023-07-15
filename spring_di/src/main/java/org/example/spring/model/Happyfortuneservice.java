package org.example.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Happyfortuneservice implements FortuneService{

	private String hfs="hello";
	private Sadfortuneservice sadfortuneservice;
	
	
	@Autowired
	public Happyfortuneservice(Sadfortuneservice sadfortuneservice) {
		
		this.sadfortuneservice = sadfortuneservice;
	}



	public String getHfs() {
		return hfs;
	}



	public void setHfs(String hfs) {
		this.hfs = hfs;
	}



	public Sadfortuneservice getSadfortuneservice() {
		return sadfortuneservice;
	}



	public void setSadfortuneservice(Sadfortuneservice sadfortuneservice) {
		this.sadfortuneservice = sadfortuneservice;
	}



	@Override
	public String toString() {
		return "hfs=" + hfs + " sadfortuneservice=" + sadfortuneservice ;
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your good day";
	}

}

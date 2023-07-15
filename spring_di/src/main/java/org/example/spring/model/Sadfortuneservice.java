package org.example.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Sadfortuneservice implements FortuneService {

	
	private String sfs="bye";
	
	
	public String getSfs() {
		return sfs;
	}


	public void setSfs(String sfs) {
		this.sfs = sfs;
	}


	@Override
	public String toString() {
		return "sfs=" + sfs ;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your bad day";
	}

}

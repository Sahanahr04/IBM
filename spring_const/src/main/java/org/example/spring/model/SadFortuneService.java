package org.example.spring.model;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "today is your bad day";
	}

}

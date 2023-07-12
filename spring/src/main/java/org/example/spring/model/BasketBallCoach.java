package org.example.spring.model;

public class BasketBallCoach implements Coach{

	private FortuneService fortuneService;
	
	
	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "practise nack volley ";
	
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}
	
	
	
	
	

}

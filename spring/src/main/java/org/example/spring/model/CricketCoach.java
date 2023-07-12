package org.example.spring.model;

	public class CricketCoach implements Coach{

		
		private FortuneService fortuneService;
		
		public CricketCoach(FortuneService fortuneService) {
			
			this.fortuneService = fortuneService;
		}
		@Override
		public String getDailyWorkOut() {
			// TODO Auto-generated method stub
			return "practise spin bowling daily";
		}

		@Override
		public String getDailyFortune() {
			// TODO Auto-generated method stub
			return fortuneService.getDailyFortune();
		}
		
		

		
		
	}



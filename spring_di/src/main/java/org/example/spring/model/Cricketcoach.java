package org.example.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
	public class Cricketcoach implements Coach{

		private String ccoach="remo";
		private Happyfortuneservice hs;
		
		@Autowired
		public Cricketcoach(Happyfortuneservice hs) {
			
			this.hs = hs;
		}
		
		





		public String getCcoach() {
			return ccoach;
		}







		public void setCcoach(String ccoach) {
			this.ccoach = ccoach;
		}







		public Happyfortuneservice getHs() {
			return hs;
		}







		public void setHs(Happyfortuneservice hs) {
			this.hs = hs;
		}







		@Override
		public String toString() {
			return "ccoach=" + ccoach + " hs=" + hs ;
		}







		@Override
		public String getDailyWorkOut() {
			// TODO Auto-generated method stub
			return "practise spin bowling daily";
		}

		
		

		
		
	}



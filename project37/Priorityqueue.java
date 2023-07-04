package project37;

import java.util.*;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		PriorityQueue<String> pq1=new PriorityQueue<String>();
		
		
		pq.add("RED");
		pq.add("GREEN");
		pq.add("ORANGE");
		pq.add("WHITE");
		pq.add("BLACK");
		
		
		
		
		
		System.out.println(pq);//by default values shuffle
		
		for (String ele:pq)
		{
			System.out.println(ele);
		}
		 
		
		pq1.add("R");
		pq1.add("G");
		pq1.add("O");
		pq1.add("W");
		pq1.add("B");
		
		
		for(String ele:pq)
		{
		  	System.out.println(pq1.contains(ele)?"yes":"no");
		}
		
		pq.addAll(pq1);
		pq.offer("DARK RED");
		
		System.out.println(pq.size());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		List<String>new_a=new ArrayList<String>(pq);
		
		
		System.out.println(new_a);
		pq.clear();
		
		System.out.println(pq);
	
	}
	

}

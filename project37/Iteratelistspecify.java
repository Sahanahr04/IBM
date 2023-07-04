package project37;

import java.util.*;

public class Iteratelistspecify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		Iterator p=ls.listIterator(2);
		while(p.hasNext())
		
		{
			System.out.println(p.next());
		}
		
	}

}

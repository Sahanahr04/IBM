//Write a Java program to iterate a linked list in reverse order.

package project37;


import java.util.*;

public class Reverselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		Iterator p=ls.descendingIterator();//no arguments should be specified
		while(p.hasNext())
		
		{
			System.out.println(p.next());
		}

	}

}

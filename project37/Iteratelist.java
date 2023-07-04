

//Write a Java program to iterate through all elements in a linked list.
package project37;


import java.util.*;

public class Iteratelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		for(String item:ls)
		{
			System.out.println(item);
		}
		

	}

}

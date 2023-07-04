//Write a Java program to append the specified element to the end of a linked list.

package project37;


import java.util.*;

public class Appendlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		LinkedList<String> ls1=new LinkedList<String>();
		ls1.add("PURPLE");
		ls1.add("VIOLET");
		ls.addAll(1,ls1);
		
		Object n1=ls.getFirst();
		
		Object n2=ls.getLast();
		System.out.println(n1);
		System.out.println(n2);

		
		System.out.println(ls);

	}

}

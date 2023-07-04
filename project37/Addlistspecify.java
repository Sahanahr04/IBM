//Write a Java program to insert the specified element at the specified position in the linked list.

package project37;


import java.util.*;

public class Addlistspecify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		System.out.println(ls);
		ls.add(0,"YELLOW");
		System.out.println(ls);

	}

}

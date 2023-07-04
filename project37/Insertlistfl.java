//Write a Java program to insert elements into the linked list at the first and last positions.

package project37;

import java.util.LinkedList;

public class Insertlistfl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ls=new LinkedList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		ls.addFirst("VIOLET");
		ls.addLast("PURPLE");
		ls.offerFirst("LIGHTBLUE");
		ls.offerLast("BROWN");
		System.out.println(ls);

	}

}

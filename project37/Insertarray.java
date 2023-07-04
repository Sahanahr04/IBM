//Write a Java program to insert an element into the array list at the first position.

package project37;

import java.util.ArrayList;
import java.util.List;

public class Insertarray {

	public static void main(String[] args) {
     List<String> ls=new ArrayList<String>();
		
		
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

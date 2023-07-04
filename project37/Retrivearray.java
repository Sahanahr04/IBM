//Write a Java program to retrieve an element (at a specified index) from a given array list.

package project37;

import java.util.ArrayList;
import java.util.List;

public class Retrivearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls=new ArrayList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		System.out.println(ls.get(0));
		
	}

}

//Write a Java program to search for an element in an array list.

package project37;

import java.util.ArrayList;
import java.util.List;

public class Searcharray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		if(ls.contains("VIOLET"))
		{
			System.out.println("FOUND");
		}
		else
		{
			System.out.println(" NOT FOUND");
		}
		
	}

}

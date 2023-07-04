//Write a Java program to iterate through all elements in an array list..

package project37;

import java.util.ArrayList;
import java.util.List;

public class Iteratearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		
		
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

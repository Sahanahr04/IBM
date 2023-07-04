//Write a Java program to sort a given array list.

package project37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		Collections.sort(ls);
		System.out.println(ls);

	}

}

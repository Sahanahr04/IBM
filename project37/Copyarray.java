//Write a Java program to copy one array list into another.
package project37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		List<String> ls1=new ArrayList<String>();
		
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		
		ls1.add("1");
		ls1.add("2");
		ls1.add("3");
		ls1.add("4");
		ls1.add("5");
		Collections.copy(ls,ls1);
		System.out.println(ls1);
		System.out.println(ls);

	}

}

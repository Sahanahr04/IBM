//Write a Java program to remove the third element from an array list.

package project37;

import java.util.ArrayList;
import java.util.List;

public class Removearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		ls.remove(0);
		System.out.println(ls);

	}

}

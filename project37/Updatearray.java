//Write a Java program to update an array element by the given element

package project37;

import java.util.ArrayList;
import java.util.List;

public class Updatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls=new ArrayList<String>();
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		ls.set(3,"BLUE");
		System.out.println(ls);

	}

}

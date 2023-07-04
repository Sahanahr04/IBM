package project37;

import java.util.ArrayList;
import java.util.*;


public class Shuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ls=new ArrayList<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		Collections.shuffle(ls);
		System.out.println(ls);
	}

}

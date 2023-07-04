package project37;
import java.util.*;
public class Hashcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("RED");
		hs.add("GREEN");
		hs.add("ORANGE");
		hs.add("WHITE");
		hs.add("BLACK");
		System.out.println(hs);
		
		HashSet<String> hs1=new HashSet<String>();
		
		hs1.add("RED");
		hs1.add("PURPLE");
		hs1.add("ORANGE");
		hs1.add("VIOLET");
		hs1.add("BLACK");
		
		for(String ele:hs)
		{
			System.out.println(hs1.contains(ele)?"yes" : "no");
		}
			
		
		

	}

}

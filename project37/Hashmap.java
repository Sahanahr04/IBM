package project37;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		HashMap<Integer,String>hm1=new HashMap<Integer,String>();
		
		
		hm.put(0,"a");// same order as declared
		hm.put(1,"b");//key value
		hm.put(2,"c");
		hm.put(3,"d");
		hm.put(4,"e");
		
		hm1.put(5,"aa");// same order as declared
		hm1.put(6,"ba");
		hm1.put(7,"ca");
		hm1.put(8,"da");
		hm1.put(9,"ea");
		
		
		hm.putAll(hm1);
		
		
		for(Map.Entry x:hm.entrySet())
		{

			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println(hm.size());
		
		hm1.clear();
		
		System.out.println(hm1);
		
		System.out.println(hm1.isEmpty());
		
		hm1=(HashMap)hm.clone();
		
		System.out.println(hm1);
		
		System.out.println(hm);
		
		if(hm.containsKey(0))
		{
			System.out.println("yes"+hm.get(0));
		}
		else
		{
			System.out.println("no");
		}
		
		if(hm.containsValue("a"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		Set s=hm.entrySet();		
		
		System.out.println(s);
		
		String v=(String)hm.get(0);
		
		System.out.println(v);
	}

}

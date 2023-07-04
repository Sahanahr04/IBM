package project37;
import java.util.*;
public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap <Integer,String> tm=new TreeMap <Integer,String>();
		TreeMap <Integer,String> tm1=new TreeMap <Integer,String>();
		
		
		
		
		tm.put(5,"aa");// same order as declared
		tm.put(6,"ba");
		tm.put(7,"ca");
		tm.put(8,"da");
		tm.put(9,"ea");
		
		tm1.put(0,"a");// same order as declared
		tm1.put(1,"b");//key value
		tm1.put(2,"c");
		tm1.put(3,"d");
		tm1.put(4,"e");
		
		tm.putAll(tm1);
		
		System.out.println(tm);
		
		for(Map.Entry<Integer,String> ele:tm.entrySet())
		{
			System.out.println(ele.getKey()+" "+ele.getValue());
		}
		
		if(tm.containsKey(0))
		{
			System.out.println("yes"+tm.get(0));
		}
		else
		{
			System.out.println("no");
		}
		
		
		
		if(tm.containsValue("a"))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		Set<Integer> keys=tm.keySet();
		for(Integer key:keys)
		{
			System.out.println(key);
		}
		
		System.out.println("Greatest key: " + tm.firstEntry());
		  System.out.println("Least key: " + tm.lastEntry());
		  
		  System.out.println("Greatest key: " + tm.firstKey());
		  System.out.println("Least key: " + tm.lastKey());
		  
		  System.out.println("Reverse order view of the keys: " + tm.descendingKeySet());
		
		tm.clear();

	}

}

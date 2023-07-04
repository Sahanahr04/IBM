package project37;


import java.util.*;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<String> ls=new TreeSet<String>();
		
		TreeSet<String> ls1=new TreeSet<String>();
		
		
		ls.add("RED");
		ls.add("GREEN");
		ls.add("ORANGE");
		ls.add("WHITE");
		ls.add("BLACK");
		
		
		ls1.add("R");
		ls1.add("G");
		ls1.add("O");
		ls1.add("W");
		ls1.add("B");
		
		
		
		
		
		
		for(String ele:ls)
		{
			System.out.println(ele);
		}//elements are shuffled by default
		
		ls.addAll(ls1);		
		System.out.println(ls);
		
		Iterator i=ls.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		Object f=ls.first();
		Object l=ls.last();
		
		System.out.println(f);
		System.out.println(l);
		
		TreeSet<String> ls2= (TreeSet<String>)ls1.clone();
		System.out.println(ls2);
		
		System.out.println(ls2.size());
		
		for(String ele:ls1)
		{
			System.out.println(ls2.contains(ele)? "yes":"no");
		}
		
		
		//Write a Java program to find numbers less than 7 in a tree set.
		
		
		TreeSet <Integer> t1=new TreeSet<Integer>();
		TreeSet <Integer> t2=new TreeSet<Integer>();
		
		t1.add(1);
		t1.add(2);
		t1.add(3);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(7);
		t1.add(8);
		t1.add(9);
		t1.add(10);
		
		t2=(TreeSet)t1.headSet(7);
		
		Iterator it;
		it=t2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next()+" ");
		}
		
		
		System.out.println("greater than or equal to 3:"+t1.ceiling(3));
		
		
		
		
		}

}

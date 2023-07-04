package project37;
import java.util.*;
public class Hash {

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
		hs1=(HashSet)hs.clone();
		System.out.println(hs1);
		
		
		String[] new_a=new String[hs.size()];
		hs.toArray(new_a);
		
		for(String ele:new_a)
		{
			System.out.println(ele);
		}
		
		System.out.println(hs.size());	
		Iterator<String> p=hs.iterator();
		while(p.hasNext())
		{
			System.out.println(p.next());	
			
		}
		
		hs.removeAll(hs);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		
		Set<String>  tree_set=new TreeSet<String>(hs1);
		List<String> list=new ArrayList<String>(hs1);
		for(String ele:tree_set)
		{
			System.out.println(ele);
		}
		
	}

}

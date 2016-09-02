package DataStructures;
import java.util.*;
public class Hash_Map_Table {
	
	public static void call_hash_map()
	{
		/*HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Siddharth");
		hm.put(2, "Tim");
		hm.put(3, "Venkata");
		hm.put(4, "Ramashri");
		hm.put(2, "Abhishek");
		System.out.println(hm.get(2)); // Overide happens
		for(Map.Entry<Integer,String> entry: hm.entrySet())
			System.out.println(entry.getKey()+","+entry.getValue());
		Set<Integer> keys = hm.keySet();
		for(int temp: keys)
		  System.out.println(hm.get(temp)+'\n');*/
		TreeMap<Integer,String> hm = new TreeMap<Integer,String>();
		hm.put(2, "Siddharth");
		hm.put(5, "Tim");
		hm.put(1, "Venkata");
		hm.put(3, "Ramashri");
		hm.put(2, "Abhishek");
		Map mp=Collections.synchronizedMap(hm);
		synchronized(mp)
		{
		 System.out.println(hm.get(2)); // Overide happens
		 for(Map.Entry<Integer,String> entry: hm.entrySet())
			System.out.println(entry.getKey()+","+entry.getValue());
		 Set<Integer> keys = hm.keySet();
		 for(int temp: keys)
		   System.out.println(hm.get(temp)+'\n');
		}
		
		
	}
   public static void main(String[] args)
   {
	   call_hash_map();
	   
   }
}

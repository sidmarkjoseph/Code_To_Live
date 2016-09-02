package DataStructures;
import java.util.*;
public class Array_List {
  public static void main(String[] args)
  {
	  ArrayList<Integer> arr = new ArrayList<Integer>();
	  for(int i=0;i < 10;i++)
	     arr.add(i,i);
	  int b[] = {11,12,13,14,15}
	  ArrayList<Integer> a = new ArrayList(Arrays.asList(b));
	  arr.addAll((Collection)a);
	  for (int temp: arr)
		  System.out.println(temp);
	  
	  
	  
  }
	
}

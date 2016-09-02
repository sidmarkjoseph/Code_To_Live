package DataStructures;
import java.math.*;
public class Edit_Distance {
  public static int edit_distance_call(String s1, String s2)
  {
	  int table[][] = new int[s1.length()+1][s2.length()+1];
	  for(int i=0; i<s1.length()+1;i++)
	  {
		  for(int j=0;j<s2.length()+1;j++)
		  {
			  if(i==0)
				  table[i][j] = j;
			  else if(j==0)
				  table[i][j] = i;
			  else if(s1.charAt(i-1) == s2.charAt(j-1))
				  table[i][j] = table[i-1][j-1];
			  else
				  table[i][j] = Math.min(Math.min(table[i-1][j],table[i][j-1]),table[i-1][j-1]) + 1 ;
				  
		  }
	  }
	  return table[s1.length()][s2.length()];
  }
  public static void main(String[] args)
  {
	  System.out.println(edit_distance_call("sitting","kitten"));
  }
}

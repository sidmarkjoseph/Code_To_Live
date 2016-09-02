package DataStructures;

public class Minimum_Number_of_Jumps {
      public static void main(String[] args)
      {
    	  int input[] = {1,4,3,7,1,2,6,7,6,10};
    	  System.out.println(find(input));
    	  
    	  
      }
      public static int find(int []input)
      {
    	  if(input.length <= 1)
    		  return 0;
    	  int stairs = input[0];
    	  int ladder = input[0];
    	  int level;
    	  int jump=1;
    	  for(level=1;level<input.length;level++)
    	  {
    		  if(level == input.length-1)
    			  return jump;
    		  if(level + input[level] > ladder)
    			  ladder = level + input[level];
    		  stairs--;
    		  if(stairs==0)
    		  {
    			  jump++;
    		     stairs=ladder-level;
    		  }  
    			  
    			   
    	  }
    	  return jump;
      }
}

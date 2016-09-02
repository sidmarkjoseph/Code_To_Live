package DataStructures;
import java.math.*;
public class Recursive_Knapsack {
	public static int find_optimal_benefit(int n,int []weight,int []value,int weight_limit)
	{
		if(n==weight.length)
			return 0;
		if(weight[n] > weight_limit)
			return find_optimal_benefit(n+1,weight,value,weight_limit);
		int include;
		int exclude;
	    include = value[n] + find_optimal_benefit(n+1,weight,value,weight_limit-weight[n]);
		exclude = find_optimal_benefit(n+1,weight,value,weight_limit);
		return Math.max(include, exclude);
		
	}
   public static void main(String[] args)
   {
	   int weight[] = {2,2,4,5};
	   int value[] ={3,7,2,9};
	   int weight_limit=10;
	   int n=0;
	   System.out.println(find_optimal_benefit(n,weight,value,weight_limit));
   }
}

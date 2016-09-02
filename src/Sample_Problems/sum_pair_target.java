package Sample_Problems;
import Sorting.QuickSort;
public class sum_pair_target {
  public static void main(String[] args)
  {
	  int target=6;
	  int len_of_array = QuickSort.A.length;
	  QuickSort.Quick(0,len_of_array-1);
	 int i=0,j=len_of_array-1;
     while(i < j)
     {
    	 if(QuickSort.A[i] + QuickSort.A[j] == target)
    	 {
    		 System.out.println("Pair found " +QuickSort.A[i]+","+QuickSort.A[j]);
    		 i++;
    		 j--;
    	 }
    	 else if ((QuickSort.A[i] + QuickSort.A[j] < target))
    		 i++;
    	 else
    	     j--;
     }
	 
	  
  }
	
	   
}

package Sorting;

public class MergeSort {
	static int A[] = {2,5,3 ,1, 7, 4, 9, 5 };
    public static void  Merging(int low, int high)
    { 
    	if ( low < high)
    	{
    	 int middle = low + (high-low)/2;
    	 Merging(low,middle);
    	 Merging(middle+1,high);
    	 Merge(low,middle,high);
    	}
    }
    public static void Merge(int low,int middle,int high)
    {
    	int temparr[] = new int[high+1];
    	for(int i = 0; i <= high; i++)
    		temparr[i] = A[i];
    	int k=low;
    	int i = low;
    	int j = middle + 1;
    	while (i <= middle && j <= high )
    	{
    		if (temparr[i] <= temparr[j])
    		{
    			A[k] = temparr[i];
    		    k++;
    			i++;
    		}
    		else
    		{
    			A[k] = temparr[j];
    		    k++;
    		    j++;
    		}
    		
    	}
    	if ( i <= middle)
    	{
    		A[k] = temparr[i];
    		k++;
    		i++;
    	}
    	if( j<=high)
    	{
    		A[k] = temparr[j];
    		j++;
    		k++;
    	}
    }
    public static void main(String[] args)
    {
    	Merging(0,A.length-1);
    	for(int i=0; i < A.length; i++)
    		System.out.println(A[i]);
    }
}

package Sorting;

public class QuickSort {
	public static int A[] = { 3,5,1,5,3,7,8};
  
	public static void Quick(int p, int r )
	{
	   if ( p < r )
	   {
	    int q = partition(p,r);
	    Quick(p,q-1);
	    Quick(q+1,r);
	   }
	}
	
	public static int partition(int p, int r)
	{
		int j;
		int x=A[r];
		int i = p-1;
		for (j = p; j <= r-1; j++)
		{
			if ( A[j] < x )
			{
				i = i + 1;
				int temp;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		 int temp;
		 temp = A[i+1];
		 A[i+1] = A[r];
		 A[r] = temp;
		 return i+1;
	}
	
	public static void main(String[] args)
	{
		 int p = 0;
		 int r = A.length -1;
		 Quick(p,r);
		 for(int i = 0; i < A.length; i++)
			  System.out.println(A[i]);
		 
	    
	}
	
}

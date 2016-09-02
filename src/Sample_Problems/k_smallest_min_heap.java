package Sample_Problems;

import java.util.LinkedList;

public class k_smallest_min_heap {
	int a[];
	int i;
	k_smallest_min_heap()
	{
		a = new int[100];
		i=0;
	}
	public void insert(int value)
	{
		int current =i;
         a[i++] = value;
         while (a[current] < a[get_parent(current)])
         {
        	 int temp=a[current];
        	 a[current] = a[get_parent(current)];
        	 a[get_parent(current)] = temp;
        	 current = get_parent(current);
         }
	   	   
	}
	public boolean isLeaf(int pos)
	{
		if (pos <= i-1 && pos >= (i-1)/2 )
		{
			return true;
		}
		return false;
	}
	public int extract_min()
	{
	
	  int minimum = a[0];
	  a[0] = a[--i];
	  a[i]=0;
	  heapify(0);
	  return minimum;
	  
	  
	}
	public void heapify(int pos)
	{
		int leftchild = 2*pos+1;
		int rightchild = 2*pos+2;
		if(!isLeaf(pos))
		{
			if(a[pos] > a[leftchild] || a[pos] > a[rightchild] )
			{
				
				if(a[leftchild] < a[rightchild])
				{
					int temp = a[pos];
				    a[pos] =a[leftchild];
					a[leftchild] = temp;
					heapify(leftchild);
				}
				else if(a[rightchild] < a[leftchild])
				{
					int temp = a[pos];
				    a[pos] =a[rightchild];
					a[rightchild] = temp;
					heapify(rightchild);
				}
			}
		}
	}
	public int get_parent(int pos)
	{
	  return (pos-1)/2;
	}
	public void display()
	{
		for(int j=0; j < i;j++)
			System.out.println(a[j]);
	}
	public static void main(String[] args)
	{
		k_smallest_min_heap heap = new k_smallest_min_heap();
		int arr[] = {8,3,4,5,2,5,7};
		for(int temp: arr)
		heap.insert(temp);
		int minimum=heap.extract_min();
		minimum=heap.extract_min();
		System.out.print(minimum);
		System.out.println("\n");
	}
	
	

}

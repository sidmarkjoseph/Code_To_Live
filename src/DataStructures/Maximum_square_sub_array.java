package DataStructures;
import java.math.*;
import java.util.Scanner;
import java.io.*;
public class Maximum_square_sub_array {
  
	int a[][];
	int m;
	int n;
	Maximum_square_sub_array(int m, int n)
	{
		Scanner in = new Scanner(System.in);
		this.m = m;
		this.n = n;
		a = new int[m][n];
		for(int i=0; i < m;i++)
		{
			for(int j=0; j< n;j++)
			{
				a[i][j] = Integer.parseInt(in.nextLine());				
			}
		}
	}
	public int[][] calculate()
	{
		int table[][] = new int[m][n];
		for(int i=0;i < m; i++)
		{
			for(int j=0;j < n;j++)
			{
				if(i==0 || j==0)
					table[i][j] = a[i][j];
				else if( a[i][j] == 0)
					table[i][j] = 0;
				else
					table[i][j] = min(table[i-1][j-1],table[i-1][j],table[i][j-1]) + 1;
			}
		}
		return table;
	}
	public int min(int a, int b, int c)
	{
		if(a<b) 
		{
		  if( b < c)
			  return a;
		  else
		  {
			  if ( a < c)
				  return a;
			  else
				  return c;
		  }
		}
		else
		{
			if ( a < c)
				return b;
			else
			{
				if ( b < c)
					return b;
				else
					return c;
			}
			   
		}
		
	}
	public int find_max()
	{
		int table[][] = calculate();
		int max = table[0][0];
		for(int i=0; i < m; i++)
		{
			for(int j=0; j < n; j++)
			{
				if (table[i][j] > max)
					max = table[i][j];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
	   Maximum_square_sub_array obj = new  Maximum_square_sub_array(2,2);
	   System.out.println(obj.find_max());
	}

}

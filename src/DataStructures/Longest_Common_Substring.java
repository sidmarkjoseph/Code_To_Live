package DataStructures;

import java.util.ArrayList;

public class Longest_Common_Substring {
 
	public static ArrayList<String> find(String s1, String s2)
	{
		int max=Integer.MIN_VALUE;
		ArrayList<String> arr = new ArrayList<String>();
		int table[][] = new int[s1.length()][s2.length()];
		for(int i=0;i < s1.length();i++)
		{
			for(int j=0;j < s2.length();j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					if(i==0 || j==0)
					   table[i][j] = 1;
					else
						table[i][j] = table[i-1][j-1] + 1;
					if (table[i][j] > max)
					{
						max = table[i][j];
						arr.clear();
						arr.add(s1.substring(i-max+1,i+1));
					   	
					}
					if(table[i][j] == max)
					{
						arr.add(s1.substring(i-max+1,i+1));
					}  						
				    	
				}
				else
					table[i][j] = 0;
					
			}
		}
		return arr;
		
	}
	public static void main(String[] args)
	{
		String s1 = "siddharth";
		String s2 = "jiddmin";
		ArrayList<String> arr = find(s1,s2);
		for(String temp: arr)
			System.out.println(temp + " " + temp.length());
	
		
	}
}

package JavaStrings;
import java.io.*;
import java.util.*;

public class GeneString {
	public static void main(String[] args)
	{
      Scanner in =  new Scanner(System.in);
      int n = Integer.parseInt(in.nextLine());
      String str = in.nextLine();
      int need = n/4;
      final String gene = "ACGT"; 
      int cnt[] = new int[4];
      int a[] = new int[n];
      for(int i=0; i < str.length(); i++)
      {
    	  a[i] = gene.indexOf(str.charAt(i));
    	  cnt[a[i]]++;
      }
     int ans = solve(a,cnt,str,n);
	}   
   
	public static int solve(int a[],int cnt[],String str,int n)
	{
		if
		return 0;
	}
	
}

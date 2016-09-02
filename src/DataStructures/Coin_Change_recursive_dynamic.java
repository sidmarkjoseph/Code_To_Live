package DataStructures;

public class Coin_Change_recursive_dynamic {
	int s[];
	int n;
	int m;
   public static void main(String[] args)
   {
	 int s[] = {1,2,3};
	 int n=4;
	 int m = s.length;
	 System.out.print(calculate(s,n,m));
	 
   }
   public static int calculate(int s[],int n,int m)
   {
	   if (n==0)
	    return 1;
	   if (n < 0)
		return 0;
	   if (m <=0 && n >=1)
		   return 0;
	   return calculate(s,n,m-1) + calculate(s,n-s[m-1],m);
   }
   
   
   
}

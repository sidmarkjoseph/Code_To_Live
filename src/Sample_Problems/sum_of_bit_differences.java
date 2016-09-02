package Sample_Problems;
public class sum_of_bit_differences {
	
    public static void main(String[] args)
    {
        int test_arr[] = { 1, 3, 5};
        int i=0;
        int j=0;
        int sum = 0;
         for (i=0; i < 32; i++)
         {
        	 int set=0;
    		 int not_set=0;
        	 for(j=0;j<test_arr.length;j++)
        	 {
        		 int temp = (test_arr[j] >> i)  & 1;
        		 if(temp == 1)
        			 set++;
        		 else if(temp == 0)
        			 not_set++;
        		 
        	 }
        	 sum += set * not_set * 2;
        		 
         }
         System.out.println("Sum of bit differences " + sum);
    }
}

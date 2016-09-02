package DataStructures;

public class Subset_Sum {

	public static boolean subset_sum(int [] input,int target)
	{
		boolean table[][] = new boolean[input.length+1][target+1];
		for(int i=1;i < target+1;i++)
			table[0][i] = false;
		for(int i=0;i<input.length+1;i++)
			table[i][0] = true;
		for(int i=1;i<input.length+1;i++)
		{
			for(int j=1;j<target+1;j++)
			{
				table[i][j] = table[i-1][j]; // First copy the data from the top
				if(table[i][j] == false && j>=input[i-1])
			       table[i][j] = table[i][j] || table[i-1][j-input[i-1]];
			}
		}
		return table[input.length][target];
	}
	public static void main(String[] args)
	{
		int input[] = {2,3,5,6};
		int target = 5;
		System.out.println(subset_sum(input,target));
		
	}
}

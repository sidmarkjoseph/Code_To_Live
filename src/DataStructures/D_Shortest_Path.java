package DataStructures;

public class D_Shortest_Path {
 public static void main(String[] args)
 {
	 int gr[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
         {4, 0, 8, 0, 0, 0, 0, 11, 0},
         {0, 8, 0, 7, 0, 4, 0, 0, 2},
         {0, 0, 7, 0, 9, 14, 0, 0, 0},
         {0, 0, 0, 9, 0, 10, 0, 0, 0},
         {0, 0, 4, 0, 10, 0, 2, 0, 0},
         {0, 0, 0, 14, 0, 2, 0, 1, 6},
         {8, 11, 0, 0, 0, 0, 1, 0, 7},
         {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        graph(gr,0,9);
 }
 public static int min_from_distance_vector(int dist[],boolean splSet[])
 {
	 int min=Integer.MAX_VALUE;
	 int min_index=0;
	for(int i=0;i < dist.length;i++)
	{
		if(splSet[i]==false)
		{
			if(dist[i]<min)
			{
				min = dist[i];
				min_index=i;
			}
				
		}
	}
	return min_index;
 }
 public static void printSolution(int []dist)
 {
	 for(int i=0;i<dist.length;i++)
		 System.out.println(dist[i]);
 }
 public static void graph(int graph[][],int src,int V)
 {
	 int dist[] = new int[V]; // Distance Vector From source
	 boolean splSet[] = new boolean[V]; // SplSet Vector
	 
	 for(int i=0; i < V;i++) // Initialize the Distance Vector and the Visited Array
	 {
		 dist[i] = Integer.MAX_VALUE;
		 splSet[i] = false;
	 }
	 dist[src] = 0;
	 for(int count=0;count<V;count++)
	 {
		 int u = min_from_distance_vector(dist,splSet);
		 splSet[u] = true;
		 for(int v=0; v < V;v++)
		 {
			 if(!splSet[v] && graph[u][v] != 0 &&
				 dist[u] + graph[u][v] < dist[v] &&
				 dist[u] != Integer.MAX_VALUE)
				 dist[v] = dist[u] + graph[u][v];
				 
		 }
	 }
	 printSolution(dist);
 }
}

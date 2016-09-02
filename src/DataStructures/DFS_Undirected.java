package DataStructures;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS_Undirected {
   LinkedList<Integer> adj[];
   int v;
   public DFS_Undirected(int v)
   {
	   this.v = v;
	   adj = new LinkedList[v];
	   for(int i=0;i<v;i++)
		   adj[i] = new LinkedList<Integer>();
   }
   public void insert_edge(int node_1, int node_2)
   {
	   adj[node_1].add(node_2);
	   adj[node_2].add(node_1);
   }
   public void DFS(int start)
   {
	   boolean visited[] = new boolean[v];
	   for(int i=0; i<v;i++)
		   visited[i] = false;
	   DFS_Helper(start,visited);
   }
   public void DFS_Helper(int node,boolean []visited)
   {
	   System.out.println(node);
	   visited[node] = true;
	  Iterator<Integer> i = adj[node].listIterator();
	  while(i.hasNext())
	  {
		  int n = i.next();
		  if(!visited[n])
		  {
		   DFS_Helper(n,visited);
		  }
	  }
   }
   public boolean isCyclic_Helper(int node,boolean []visited, int parent)
   {
	   visited[node] = true;
	   Iterator<Integer> it = adj[node].listIterator();
	   while(it.hasNext())
	   {
		   int n= it.next();
	    if(!visited[n])
	    {
		   if(isCyclic_Helper(n,visited,node))
			   return true;
	    }
	    else if(n != parent)
	           return true;
	   }
	   return false;
   }
   public boolean isCyclic()
   {
	   boolean visited[] = new boolean[v];
	   for(int i=0;i<v;i++)
		   visited[i] = false;
	   int parent = -1;
	   boolean flag=false;
	   for(int i=0;i<v;i++)
	   {
		  if(!visited[i])
			  if(isCyclic_Helper(i,visited,parent))
					  return true;
	   }
	   return false;
   }
   public static void main(String []args)
   {
	   DFS_Undirected obj = new DFS_Undirected(4);
	   obj.insert_edge(0, 1);
       obj.insert_edge(1, 2);
       obj.insert_edge(2, 3);
       //obj.insert_edge(3, 4);
       //obj.insert_edge(1, 2);
       //obj.insert_edge(2, 0);
       //obj.insert_edge(2, 3);
       //obj.DFS(0);
       System.out.println(obj.isCyclic());
   }
   
}

package DataStructures;
import java.util.*;
public class DFS_Directed {
    private int v; // No of vertices in the graph
    private LinkedList<Integer> list[];
    DFS_Directed(int v)
    {
    	this.v=v;
    	list = new  LinkedList[v];
    	for(int i=0; i<v;i++)
    		list[i]= new LinkedList<Integer>();
    }
    public void insert(int from, int to)
    {
    	list[from].add(to);
    }
    public void DFS(int start)
    {
    	boolean visited[] = new boolean[v];
    	DFS_helper(start,visited);
    }
    public void DFS_helper(int node,boolean []visited)
    {
    	visited[node] = true;
    	System.out.println(node);
    	Iterator<Integer> i = list[node].listIterator();
        while(i.hasNext())
        {
        	int n = i.next();
        	if(!visited[n])
        	{
        		DFS_helper(n,visited);
        	}
        }
        
    }
    public boolean isCyclic_Helper(int node,boolean visited[])
    {
    	visited[node] = true;
    	int i;
        Iterator<Integer> it =   list[node].listIterator();
        while(it.hasNext())
        {
          i = it.next();
          if(!visited[i])
          {
        	  if(isCyclic_Helper(i,visited))
        		  return true;
          }
          else if(visited[i])
        	  return true;
  
        }
        return false;
     
    }
    public boolean isCyclic()
    {
    	boolean flag;
       boolean visited[] = new boolean[v];
       for(int i=0;i < v; i++)
           visited[i] = false;
       for(int i=0; i < v; i++)
       {
    	   flag = isCyclic_Helper(i,visited);
    	   if(flag == true)
    		  return true;
       }
       return false;
    }
    public void BFS(int src)
    
    {
    	boolean visited[] = new boolean[v];
    	for(int i=0;i<v;i++)
    		visited[i] = false;
    	Queue<Integer> q = new LinkedList<Integer>();
    	q.add(src);
        for(int i=0;i<v;i++)
        {
        	Iterator<Integer> it = list[i].listIterator();
        	while(it.hasNext())
        	{
        		int n=it.next();
        		if(!visited[n])
        		{
        			visited[n] = true;
        			q.add(n);
        		}
        	}
        	
        }
        while(!q.isEmpty())
        {
        	System.out.println(q.poll());
        }
    	
    }
    public static void main(String[] args)
    {
    	DFS_Directed g = new DFS_Directed(5);
           g.insert(0, 1);
           g.insert(0, 2);
           g.insert(1, 3);
           g.insert(3, 4);
           //g.insert(2, 0);
           //g.insert(2, 3);
           //g.insert(3, 3);
          // g.DFS(2);
          g.BFS(0);
           //boolean flag = g.isCyclic();
           //System.out.println(flag);
    }

}

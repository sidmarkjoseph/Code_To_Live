package DataStructures;
import DataStructures.Node;
public class BST_Impl {
     public  Node root;
     public int count=0;
     public static int sum=0;
     public BST_Impl()
     {
    	 this.root = null;
     }
     public void insert(int data){
    	 Node newnode = new Node(data);
    	 if(root == null)
    	 {
    		root = newnode;
    		return;
    	 }
    	 Node current = root;
    	 Node parent;
         while (true)
         {
        	 parent = current;
        	 if(data < parent.data)
        	 {
        		 current = parent.left;
        		 if (current == null)
        		 {
        			 parent.left = newnode;
        			 return;
        		 }
        	 }
        	 else
        	 {
        		 current = parent.right;
        		 if ( current == null)
        		 {
        			 parent.right = newnode;
        			 return;
        		 }
        	 }
         }
     }
     public void display(Node root)
     {
    	 
    	 if(root == null)
    		 return;
    	 System.out.println(root.data);
    	 display(root.left);
    	 display(root.right);
     }
     public boolean check_BST_Helper(Node node,int min,int max)
     {
    	 if(node==null)
    		 return true;
    	 if(node.data < min && node.data > max)
    		 return false;
    		 
    		 return check_BST_Helper(node.left,min,node.data-1) &&
    				 check_BST_Helper(node.right,node.data+1,max);
     }
     public void check_BST(Node root)
     {
    	 int min = Integer.MIN_VALUE;
    	 int max = Integer.MAX_VALUE;
    	 if(check_BST_Helper(root,min,max))
    	    System.out.println("It is a binary Search Tree\n");
    	 
     }
	public void sorted_order(Node root)
	{
		if(root == null)
			return;
		sorted_order(root.left);
		System.out.println(root.data);
		sorted_order(root.right);
	}
	public Node find_smallest()
	{
		if (root == null)
			return null;
		Node current = root;
		while (current.left != null)
			current = current.left;
		return current;
			
			
	}
	public void smallest_element()
	{
		Node smallest = find_smallest();
		System.out.print(smallest.data);
	}
	public void k_smallest_element(Node root,int k)
	{
		if(root == null)
			return;
		k_smallest_element(root.left,k);
		count++;
		if(count == k)
		 System.out.println(root.data);
		k_smallest_element(root.right,k);
	}
	public boolean delete(int id)
	{
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data != id)
		{
			parent = current;
			if(id < current.data)
			{
				isLeftChild = true;
				current = current.left;
			}
			else
			{
				isLeftChild = false;
				current=current.right;
				
			}
			if (current ==null)
				return false;
		}
		if (current.left == null && current.right == null) /* When there are no children */
		{
			if(current == root)
				root=null;
			if(isLeftChild)
			{
				parent.left =null;
			}
			if(!isLeftChild)
			{
				parent.right = null;
			}
		}
		return true;
	}
	public int Max_Height(Node current)
	{
	   if(current == null)
		   return 0;
	   int lDepth = Max_Height(current.left);
	   int rDepth = Max_Height(current.right);
	   if(lDepth > rDepth)
		   return lDepth + 1;
	   else
		   return rDepth + 1; 
	}
	public static void main(String[] args)
	{
		BST_Impl A = new BST_Impl();
		A.insert(5);
		A.insert(2);
		A.insert(56);
		A.insert(1);
		//A.check_BST(A.root);
		//int sum=0;
		A.find_sum_of_numbers(A.root);
		System.out.println(A.sum);
		//A.sorted_order(A.root);
		//System.out.println(A.find(43));
		//A.smallest_element();
		//A.count=0;
		//A.k_smallest_element(A.root,3);
		//if(A.delete(1))
		//{
			//System.out.println("Element deleted");
		//}
		//A.display(A.root);
		  //System.out.println(A.Max_Height(A.root));
	}
	public boolean find(int data)
	{
		Node current = root;
		while (current != null)
		{
			if(current.data == data)
			return true;
			else if (data < current.data)
				current = current.left;
			else
				current = current.right;
			
		}
		return false;
	}
	public void find_sum_of_numbers(Node root)
	{
		if(root == null)
			return;
		sum+=root.data;
		find_sum_of_numbers(root.left);
		find_sum_of_numbers(root.right);
		
	  
	}
	
	
}


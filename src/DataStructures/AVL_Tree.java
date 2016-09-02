package DataStructures;

public class AVL_Tree {
	
	N1 root;
	int height(N1 N)
	{
		if(N==null)
			return 0;
		return N.height;
	}
	int getBalance(N1 N)
	{
		if(N == null )
			return 0;
		return height(N.left) -height(N.right);
	}
	N1 insert(N1 N1,int key)
	{
		if(N1 == null)
		{
			N1 temp = new N1(key);
			return temp;
		}
		if( key < N1.key )
			N1.left = insert(N1.left,key);
		if(key > N1.key)
			N1.right = insert(N1.right,key);
		N1.height = Math.max(height(N1.left), height(N1.right)) + 1;
		int balance = getBalance(N1);
		if(balance > 1 && key < N1.left.key)
		{
			return rightRotate(N1);
		}
		if( balance > 1 && key > N1.left.key)
		{
			N1.left = leftRotate(N1.left);
			return rightRotate(N1);
			
		}
		if(balance < -1 && key > N1.right.key)
			return leftRotate(N1);
		if(balance < -1 && key < N1.right.key)
		{
			N1.right = rightRotate(N1.right);
		    return leftRotate(N1);
		}
		return N1;
	}
    N1 rightRotate(N1 x)
    {
    	N1 y = x.left;
    	N1 T2 = y.right;
    	
    	y.right = x;
    	x.left = T2; 
    	x.height = Math.max(height(x.left), height(x.right)) + 1;
    	y.height = Math.max(height(y.left), height(y.right)) + 1;
    	return y;
    }
    N1 leftRotate(N1 x)
    {
    	N1 y = x.right;
    	N1 T2 = y.left;
    	
    	y.left = x;
    	x.right = T2;
    	x.height = Math.max(height(x.left), height(x.right)) + 1;
    	y.height = Math.max(height(y.left), height(y.right)) + 1;
    	return y;
    }
    public static void main(String[] args)
    {
    	
    }
}
class N1
{
	int key;
	int height;
	N1 left;
	N1 right;
	N1(int d)
	{
		this.key = d;
		this.height =1;
		this.left =  null;
		this.right = null;
	}
}
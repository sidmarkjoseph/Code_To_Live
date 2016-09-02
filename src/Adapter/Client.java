package Adapter;

public class Client {
    public static void main(String[] args)
    {
    	
    	Target target = new TargetImpl();
    	target.display();
    	target = new Adapter();
    	target.display();
    }
}

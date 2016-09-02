package Adapter;

public class Adapter implements Target {
	Adaptee adaptee;

     Adapter()
     {
    	 this.adaptee = new AdapteeImpl();
     }
     public void display()
     {
    	 adaptee.Adaptee_Display();
    	
     }
}

package week3.day1;

public class Edge extends Browser //Sub-class extends Superclass


{
	
	public void openURL()//method Overriding
	

	{
		System.out.println("Edge browser URL");
		//Same method name and signature
		// Child class method is printed
	}
	
	public void  takeSnap()
	{
		
		System.out.println("Method6 from Sub-class Edge:takeSnap() ");
		
	}

	public void   clearCookies()
	{
		
		System.out.println("Method7 from Sub-class Edge:clearCookies() ");
		
	}
	public static void main(String[] args)
	{
		Edge eb=new Edge();
		eb.openURL();// method inherited from Super class
		//eb.clearCache();//This will not execute- Child cannot inherit child - there is no Sibling inheritance
		
		
		
}
}

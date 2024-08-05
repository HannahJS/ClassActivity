package week3.day1;

public class Chrome extends Browser //Sub-class extends Superclass

{
	public void  openIncognito()
	{
		
		System.out.println("Method4 from Sub-class Chrome:openIncognito() ");
		
	}
	
	public void  clearCache()
	{
		
		System.out.println("Method5 from Sub-class Chrome:clearCache() ");
		
	}
	public static void main(String[] args)
	{
		Chrome cb=new Chrome();
		cb.openIncognito();
		cb.clearCache();
		System.out.println(cb.browserName+cb.browserVersion);
		// This is Hierarchical Inheritance - where we use single parent(Browser) and we have multiple child class 
		//(Chrome,Edge, Safari trying to inherit from single parent class
		//Objects will be created inside child class- that is the concept of inheritance

	}	
	
}


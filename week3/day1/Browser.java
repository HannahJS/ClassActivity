package week3.day1;

public class Browser //Create a superclass Browser

{
	//Add at least two variables to the Browser class: browserName and browserVersion
	
	String browserName ="Chrome";
	float browserVersion= 1.2f;
	
	
	public void  openURL()
	{
		System.out.println("Browser method URL");// understand Method Overriding
		System.out.println("Method1 from Superclass-Browser- OpenURL()");
		
	}
	
	
	public void  closeBrowser()
	{
		System.out.println("Method2 from Superclass-Browser- closeBrowser()");
		
		
	}
	
	public void   navigateBack()
	{
		System.out.println("Method3 from Superclass-Browser- navigateBack()");
		
		
	}
}

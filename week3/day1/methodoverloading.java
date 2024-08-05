package week3.day1;

public class methodoverloading {

	
	
	
	public int data(int integer)
	{
		
		System.out.println("Overloading- Data()"+integer);
		return integer;
		
		// if the method has return type(HERE IT IS INT) then you should use return statement
	}

	public void data(int integer, String name)
	{
		
		System.out.println("Overloading- Data(int String)"+ "\n"+integer + name);
		
		// if the method has return type 'void' then you NEED NOT use return type
	}
	
	
	public void data(String name,boolean booleanValue)
	{
		
		System.out.println("Overloading- Data(String boolean)"+ "\n" +name +booleanValue);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
methodoverloading mo=new methodoverloading();
mo.data(1);
mo.data(1,"Hannah");
mo.data("Hannah", true);


	}

}

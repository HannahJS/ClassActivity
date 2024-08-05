package week3.day2;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="HANnah";
int countH=0;
char[] charArray = name.toCharArray();
for(int i=0;i<charArray.length;i++)
{
	if(charArray[i]=='h')
	{
		countH++;
		
		
	}
	
}



System.out.println("Total nume of H in "+name +"is" +countH);


	}

}

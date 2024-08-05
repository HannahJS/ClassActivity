package week3.day2;

public class Amazon extends Canarabank
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//implement all methods
		
		Amazon pay=new Amazon();
		pay.cardPayments();
		pay.cashOnDelivery();
		pay.upiPayments();
		
	}

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method- recordPaymentDetails()");
	}

	

}

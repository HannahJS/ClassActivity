package week3.day2;

public abstract class Canarabank implements Payments {
	
	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("CashOnDelivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("upiPayments");
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("cardPayment");
	}

	@Override
	public void internrtBanking() {
		// TODO Auto-generated method stub
		System.out.println("internrtBanking");
		
	}

	public abstract void recordPaymentDetails();
	
	

}

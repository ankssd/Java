package Abstraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		System.out.println(obj.sum(9,1));
		System.out.println(obj.sum(7,2,1));
		System.out.println(obj.sum((float)3.5,(float)6.5));
		
		ATM atm = new SBI();
		atm.withDraw();
		
	}
}

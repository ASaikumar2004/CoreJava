package Polymorphism;

class ElectricyBill {
	public void calculatebill(int units) {
		double totalbill = units * 8;
		System.out.println("Totalbill is: " + totalbill);
	}

	public void calculatebill(int units, double servicecharge) {
		double totalbill = (units * 8) + servicecharge;
		System.out.println("totalbill after service charge is: " + totalbill);
	}

	public void calculatebill(int units, double servicecharge, double tax) {
		double billamount = (units * 8) + servicecharge;
		double taxamount = billamount * (tax / 100);
		double finalamount = billamount - taxamount;
		System.out.println("total bill after tax and service charge is: " + finalamount);
	}
}

public class ElectricityBillCalculator {
	public static void main(String[] args) {
		ElectricyBill e=new ElectricyBill();
		e.calculatebill(8);
		e.calculatebill(8, 20);
		e.calculatebill(8, 20, 10);
	}
}

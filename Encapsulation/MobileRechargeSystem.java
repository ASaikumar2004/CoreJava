package Encapsulation;

import java.util.*;

class Recharge {

	private Long mobileno;
	private String operatorname;
	private double rechargeamount;

	public Long getMobileno() {
		return mobileno;
	}

	public void setMobileno(Long mobileid) {
			this.mobileno = mobileid;
	}

	public String getOperatorname() {
		return operatorname;
	}

	public void setOperatorname(String operatorname) {
		this.operatorname = operatorname;
	}

	public double getRechargeamount() {
		return rechargeamount;
	}

	public void setRechargeamount(double rechargeamount) {
		this.rechargeamount = rechargeamount;
	}

}

public class MobileRechargeSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Recharge r=new Recharge();
		System.out.println("Enter your mobile number: ");
		r.setMobileno(sc.nextLong());
		System.out.println("Enter opertaor name: ");
		r.setOperatorname(sc.next());
		System.out.println("Enter recharge amount: ");
		r.setRechargeamount(sc.nextDouble());
		System.out.println("MobileNumber is: "+r.getMobileno());
		System.out.println("Operator name  : "+r.getOperatorname());
		System.out.println("Recharge AMount: "+r.getRechargeamount());
		sc.close();
	}
}

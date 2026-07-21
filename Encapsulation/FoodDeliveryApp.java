package Encapsulation;

class order {
	private int orderid;
	private String customername;
	private double totalamount;
	private String orderstatus;

	public int getorderid() {
		return orderid;
	}

	public String getcustmomername() {
		return customername;
	}

	public double gettotalamouunt() {
		return totalamount;
	}

	public String getorderstatus() {
		return orderstatus;
	}

	public void setorderid(int orderid) {
		this.orderid = orderid;
	}

	public void setcustomername(String customername) {
		this.customername = customername;
	}

	public void settotalamount(double totalamount) {
		if (totalamount > 0) {
			this.totalamount = totalamount;
		} else {
			System.out.println("Amount can not be set to zero...");
		}
	}

	public void setorderstatus(String orderstatus) {
		if (orderstatus.equals("Pending")
				|| orderstatus.equals("Preparing")
				|| orderstatus.equals("Delivered")
				|| orderstatus.equals("Cancelled")) {
			
			this.orderstatus = orderstatus;
		} else {
			System.out.println("Invalid order status.");
		}
	}
}

public class FoodDeliveryApp {

	public static void main(String[] args) {

		order o=new order();
		o.setorderid(1001);
		o.setcustomername("Saikumar");
		o.settotalamount(1000);
		o.setorderstatus("Preparing");
		
		System.out.println("Order id: "+o.getorderid());
		System.out.println("Customer name: "+o.getcustmomername());
		System.out.println("Total amount: "+o.gettotalamouunt());
		System.out.println("Status: "+o.getorderstatus());
	}

}

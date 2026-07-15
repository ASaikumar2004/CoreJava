package OOPSConcepts;

public class Customers {

	int oid;
	String resname;
	String fooditem;
	String address;

	public Customers(int oid) {
		this.oid=oid;
		System.out.println("Order ID: "+oid);
	}
	
	public Customers(int oid,String resname) {
		this(oid);
		this.resname=resname;
		System.out.println("Restaurant: "+resname);
	}
	
	public Customers(int oid,String resname,String fooditem) {
		this(oid,resname);
		this.fooditem=fooditem;
		System.out.println("Food Item: "+fooditem);
	}
	
	public Customers(int oid,String resname,String fooditem,String address) {
		this(oid,resname,fooditem);
		this.address=address;
		System.out.println("Delivery Address : "+address);
	}
	
	public static void main(String[] args) {
		Customers cu = new Customers(1001,"Paradise","Chicken Biryani","Hyderabad");
	}
}

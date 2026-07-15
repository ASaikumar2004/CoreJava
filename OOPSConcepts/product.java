package OOPSConcepts;

public class product {
	int oid;
	String oname;
	double price;
	public product(int oid) {
		this.oid=oid;
		System.out.println("oid: "+oid);
	}
	
	public product(int oid,String oname) {
		this(oid);
		this.oname=oname;
		System.out.println("Order name: "+oname);
	}

	public product(int oid, String oname, double price) {
		this(oid,oname);
		this.price=price;
		System.out.println("Order price: "+price);

	}

	public static void main(String[] args) {
		product p = new product(101, "laptop", 20000.0);
	}
}

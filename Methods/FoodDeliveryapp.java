package Methods;

public class FoodDeliveryapp {
	int orderid;
	String cname;
	String resname;
	String foodname;
	int quantity;
	double price;
	double discount;
	double totalbill;
	int deliverycharge;
	double finalprice;

	public FoodDeliveryapp(int orderid, String cname, String resname, String foodname, int quantity, double price) {
		this.orderid = orderid;
		this.cname = cname;
		this.resname = resname;
		this.foodname = foodname;
		this.quantity = quantity;
		this.price = price;
	}

	public void calculatetotal() {
		totalbill = price * quantity;
	}

	public void discount() {
		if (totalbill > 1000) {
			discount = totalbill * (15 / 100);
		} else {
			discount = 0;
		}
		finalprice = totalbill - discount;
	}

	public void deliverycharge() {
		if (price < 500) {
			deliverycharge=50;
		} else {
			deliverycharge=0;
		}
		finalprice = totalbill - discount + deliverycharge;
	}
	

	public void display() {
		System.out.println("========== BILL ==========");
		System.out.println("Order ID       : " + orderid);
		System.out.println("Customer Name  : " + cname);
		System.out.println("Restaurant     : " + resname);
		System.out.println("Food Item      : " + foodname);
		System.out.println("Quantity       : " + quantity);
		System.out.println("Price Per Item : " + price);
		System.out.println("Total Bill     : " + totalbill);
		System.out.println("Discount       : " + discount);
		System.out.println("Delivery Charge: " + deliverycharge);
		System.out.println("Final Bill     : " + finalprice);
		System.out.println(" ");
	}

	public static void main(String[] args) {
		FoodDeliveryapp c1 = new FoodDeliveryapp(101, "Sai", "KFC", "Burger", 2, 200);
		FoodDeliveryapp c2 = new FoodDeliveryapp(102, "Rahul", "Dominos", "Pizza", 5, 250);
		FoodDeliveryapp c3 = new FoodDeliveryapp(103, "Anjali", "Biryani House", "Biryani", 1, 350);

		c1.calculatetotal();
	    c1.discount();
	    c1.deliverycharge();
	    c1.display();

	    c2.calculatetotal();
	    c2.discount();
	    c2.deliverycharge();
	    c2.display();

	    c3.calculatetotal();
	    c3.discount();
	    c3.deliverycharge();
	    c3.display();
	}
}

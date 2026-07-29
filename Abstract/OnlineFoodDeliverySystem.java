package Abstract;

abstract class Restaurants {
	String name;
	String location;

	Restaurants() {
		this.name = "unknown";
		this.location = "unknown";
	}

	public void setdetails(String name, String location) {
		this.name = name;
		this.location = location;
	}

	abstract void preparefood();

	public void display() {
		System.out.println("name    : " + name);
		System.out.println("Location: " + location);
		System.out.println();
	}
}

class pizzares extends Restaurants {

	@Override
	void preparefood() {
		System.out.println("Pizza is preparing in pizza restaurant");
	}

}

class biryani extends Restaurants {

	@Override
	void preparefood() {
		System.out.println("Biryani is prepareing in biryani hub");
	}
}

class Sprouts extends Restaurants {

	@Override
	void preparefood() {
		System.out.println("Sprouts ordered from Argi Gold");
	}
}

public class OnlineFoodDeliverySystem {

	public static void main(String[] args) {

		Restaurants r = new pizzares();
		r.setdetails("Pizza Restraunts", "Visakapatnam");
		r.preparefood();
		r.display();

		Restaurants r1 = new biryani();
		r1.setdetails("Paradise Restraunts", "Hyderabad");
		r1.preparefood();
		r1.display();

		Restaurants r2 = new Sprouts();
		r2.setdetails("AGRI GOLD", "PATHAPATNAM");
		r2.preparefood();
		r2.display();
   
	}
}

package Abstract;

abstract class Restaurants {
	String name;
	String location;

	Restaurants(String name, String location) {
		this.name = name;
		this.location = location;
	}

	abstract void preparefood();

	public void display() {
		System.out.println("name    : "+name);
		System.out.println("Location: "+location);
		System.out.println();
		
	}
}

class pizzares extends Restaurants {

	pizzares(String name, String location) {
		super(name, location);
	}

	@Override
	void preparefood() {
		System.out.println("Pizza is preparing in pizza restaurant");
	}

}

class biryani extends Restaurants {
	biryani(String name, String location) {
		super(name, location);
	}

	@Override
	void preparefood() {
		System.out.println("Biryani is prepareing in biryani hub");
	}
}

class Sprouts extends Restaurants{
	Sprouts(String name, String location){
		super(name, location);
	}
	
	@Override
	void preparefood() {
		System.out.println("Sprouts ordered from Argi Gold");
	}
}
public class OnlineFoodDeliverySystem {

	public static void main(String[] args) {

		OnlineFoodDeliverySystem o=new OnlineFoodDeliverySystem();
		
		Restaurants r=new pizzares("Pizza", "Hyderabad");
		r.preparefood();
		r.display();
		
		Restaurants r1=new biryani("Biyani House", "Hyderabad");
		r1.preparefood();
		r1.display();
		
		Restaurants r2=new Sprouts("AGRI GOLD", "PATHAPATNAM");
		r2.preparefood();
		r2.display();
		
	}
}

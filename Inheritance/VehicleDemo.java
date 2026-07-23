package Inheritance;

class vehicle {

	void sunroof() {
		System.out.println("Vehicle opened sunroof");
	}

	void wheels() {
		System.out.println("Its a 4 wheeler vehicle");
	}
}

class car extends vehicle {
	public void car1() {
		System.out.println("vehicle is car");
	}
}

class electriccar extends car  {
	public void electric() {
		System.out.println("Vehicle is electric car");
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		/*
		 * car c = new car(); c.sunroof(); c.wheels();
		 */
		
		electriccar ec=new electriccar();
		ec.electric();
		ec.car1();
		ec.sunroof();
		ec.wheels();
		

	}

}

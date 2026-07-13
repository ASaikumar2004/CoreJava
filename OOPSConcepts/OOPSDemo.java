package OOPSConcepts;


public class OOPSDemo {
	double length;
	double breath;
	double area;
	
	
	public OOPSDemo(double length,double breath) {
		this.length=length;
		this.area=length*breath;
	}

	public static void main(String[] args) {
		OOPSDemo rect1= new OOPSDemo(10,20);
		System.out.println(rect1.length);
		System.out.println(rect1.area);

}
}
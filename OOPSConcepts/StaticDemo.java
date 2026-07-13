package OOPSConcepts;

public class StaticDemo {
	static {
		System.out.println("Static block 1");
	}
	static {
		System.out.println("static bloack 2");
	}
	{
		System.out.println("Instance block 1");
	}

	int eid;
	String ename;
	static String company = "codegnan it solutions";

	public static void main(String[] args) {
		StaticDemo s=new StaticDemo();
		s.eid=101;
		s.ename="Dhurandhar";
		System.out.println(s.eid+" "+s.ename+" "+company);
		
		StaticDemo s1=new StaticDemo();
		s1.eid=102;
		s1.ename="Dhurandhar";
		System.out.println(s1.eid+" "+s1.ename+" "+company);
	}

}

package OOPSConcepts;

public class StudentObjects {

	int id;
	String name;
	char gender;
	String email;
	static String institutename="codegnan";
	
	public static void main(String[] args) {
		StudentObjects s=new StudentObjects();
		s.id=101;
		s.name="sai";
		s.email="ampolusaikumar2004@gmail.com";
		
		StudentObjects s1=new StudentObjects();
		s1.id=102;
		s1.name="sivani";
		s1.email="ampolusivani@gmail.com";
		
		System.out.println(s.id +" "+s.name+" "+s.email+"\n Institute name: " +institutename);
		System.out.println(s1.id +" "+s1.name+" "+s1.email);
		
	}
}

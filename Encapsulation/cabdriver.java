package Encapsulation;

public class cabdriver {
	public static void main(String[] args) {
		employee e1=new employee();
		e1.setEmpId(101);
		e1.setEmpName("sai");
		System.out.println("empid: "+e1.empid()+"\nemployee name: "+e1.empname());
	}

}

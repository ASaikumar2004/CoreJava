package OOPSConcepts;

public class patient {

	int pid;
	String pname;
	String disease;
	double billamount;
	
	public patient(int pid) {
		this.pid=pid;
		System.out.println("Patient ID: "+pid);
	}
	
	public patient(int pid,String pname) {
		this(pid);
		this.pname=pname;
		System.out.println("Patient name: "+pname);
	}
	
	public patient(int pid,String pname,String disease) {
		this(pid,pname);
		this.disease=disease;
		System.out.println("Disease: "+disease);
	}
	
	public patient(int pid,String pname,String disease,double billamount) {
		this(pid,pname,disease);
		this.billamount=billamount;
		System.out.println("Bill Amount: "+billamount);
	}
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Patient Registration started");
		patient p=new patient(101,"siva","fever");
		patient p1=new patient(101,"siva","fever",2023.0);
		System.out.println();
	}
}

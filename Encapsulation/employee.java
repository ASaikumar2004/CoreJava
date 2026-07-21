package Encapsulation;

public class employee {
     private int empid;
     private String empname;
     
     public int empid() {
    	 return empid;
     }
     
     public String empname() {
    	 return empname;
     }
     
     public void setEmpId(int empid) {
    	 if(empid>0) {
    		 this.empid=empid;
    	 }
    	 else {
    		 System.out.println("Invalid user id");
    	 }
     }
     
     public void setEmpName(String empname) {
    	 this.empname=empname;
     }
	
}

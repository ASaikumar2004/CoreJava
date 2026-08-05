package Strings;

public class RemoveCapital {
	public static void main(String[] args) {
		String name="jAvA DeVeloPer";
		String res="";
		
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			
			if(!(ch>='A' && ch<='Z') && ch!=' ') {
				res+=ch;
			}
		}
		
		System.out.println(res);
	}

}

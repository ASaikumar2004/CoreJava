package Strings;

public class StringBufferDemo {
	public static void main(String[] args) {
		//StringBuffer sb=new StringBuffer("java");
        //System.out.println(sb);
		//sb.append("developer");
		//System.out.println(sb);
		
		//reverse
		//System.out.println(sb.reverse());
		
		//length()
		//System.out.println(sb.length());
		
		//insert(0,"core");
		//System.out.println(sb.insert(0, "Core"));
		
		//capacity()
		//StringBuffer sb1=new StringBuffer();
		//System.out.println(sb1.length()); //0
		//System.out.println(sb1.capacity()); //16
		
		//delete
		StringBuffer sb1=new StringBuffer("core java");
		System.out.println(sb1);
		//System.out.println(sb1.delete(2, 5));
		//System.out.println(sb1.deleteCharAt(4));
		
		//setCharAt();
		sb1.setCharAt(1, 'k');
		System.out.println(sb1);
		
		
//		String s="java";
//		s.concat("developer");
//		System.out.println(s);
	}

}

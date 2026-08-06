package Strings;

public class UniqueCharacters {
	public static void main(String[] args) {
		String str = "javajavajavadevdevdev";
		String res="";
//		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			if(res.indexOf(ch)==-1) {
				res+=ch;
			}
			
//			int count = 0;
//			for (int j = 0; j < i; j++) {
//				if (ch[i] == ch[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.print(ch[i] + " ");
//			}
		}
		System.out.println(res);
	}
}

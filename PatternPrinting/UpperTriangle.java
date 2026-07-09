package PatternPrinting;

public class UpperTriangle {
public static void main(String[] args) {
	int n=4;
	int star=1;
	int space=n-star;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}
		System.out.println();
		star+=2;
		space--;
	}
}
}

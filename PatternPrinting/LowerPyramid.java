package PatternPrinting;

public class LowerPyramid {

	public static void main(String[] args) {
		int n=5;
		int star=2*n-1;
		int space=0;
		for(int i=1;i<=n;i++) {
			
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
			star-=2;
			space++;
		}
	}

}

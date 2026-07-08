package PatternPrinting;

public class RightAngleTriangle {
	public static void main(String[] args) {
		int n = 4;
		int star = 1;
		int space = n - star;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			System.out.println();
			star++;
			space--;
		}
	}
}

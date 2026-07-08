package PatternPrinting;

public class Reversepattern {
	public static void main(String[] args) {
		int n = 4;
		int star = n;
		int space = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
			}
			System.out.println();
			star--;
			space++;
		}
	}
}

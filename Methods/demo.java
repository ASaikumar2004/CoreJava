package Methods;

import java.util.Random;

public class demo {
	public int generatenumber() {
		Random r=new Random();
		int n=r.nextInt(10);
		return n;
	}
	public static void main(String[] args) {
		demo d=new demo();
		int num=d.generatenumber();
		System.out.println(num);
	}

}

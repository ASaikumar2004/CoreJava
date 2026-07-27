package RockPaperScissors;

import java.util.*;

public class RandomNumbers {
	public static void main(String[] args) {
		Random rm=new Random();
		int val=rm.nextInt(10);
		System.out.println(val);
	}
}

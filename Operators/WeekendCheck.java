package Operators;

public class WeekendCheck {
public static void main(String[] args) {
	int today=6;
	String result=(today>=1 && today<=7)?(today==6 || today==7)
			       ?"Weekend":"weekday":"invalid";
	System.out.println(result);
}
}

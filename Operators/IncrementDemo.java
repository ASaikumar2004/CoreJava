package Operators;

public class IncrementDemo {
	public static void main(String[] args) {
		
		/*1)Write a Java program that declares an integer variable 
		employeeId = 100. Use the post-increment (employeeId++) 
     	operator to print the current employee ID and then print the updated employee I*/
		int Employeeid=100;
		System.out.println("After using post-increment id 100 is: "+ Employeeid++);
		
		
		/*Write a Java program that declares a variable token = 50. Use the pre-increment
		 *  (++token) operator and print the token number before serving the customer.*/
		int token=50;
		System.out.println("After using pre-increment token 20 is: "+ ++token);
		
		/* A theatre has 20 available seats. After one ticket is booked, 
		 * decrease the number of seats using the 
		 * post-decrement (seats--) operator. 
		 * Print the available seats before and after booking.*/
		int seats=20;
		System.out.println("After postdecrement seats 20 is: "+seats--);
		
		/*A mobile battery is at 80%. Use the pre-decrement (--battery)
		 *  operator to reduce the battery percentage before displaying it.*/
		int battery=80;
		System.out.println("After predecrement battery 80 is: "+ --battery);
		
		/*Write a Java program that keeps track of visitors using 
		 * a variable visitors = 200. Increment the visitor count twice 
		 * using different increment operators (++ and ++variable), 
		 * then print the final count.*/
		
		int visitors=200;
		visitors++;
		++visitors;
		System.out.println("after doing both post and pre increments the value is: "+visitors);
		
		/*A shop has 30 products in stock. Sell one product using the
		 *  post-decrement (stock--) operator and another product 
		 *  using the pre-decrement (--stock) operator. Print the stock after each operation.*/
		
		int stock=30;
		int stock1=stock--;
		System.out.println("after post decrement "+stock1);
		int stock2=--stock;
		System.out.println("after pre decrement "+stock2);
		
//		Create a variable rollNo = 25. Use both 
//		pre-increment and post-increment in separate print statements. 
//		Observe how the output changes.
		
		int marks=60;
		int m= ++marks;
		int m1= marks--;
		System.out.println("value after pre-increment: "+m);
		System.out.println("value after post-decrement: "+m1);
		
//		A temperature sensor shows 35°C. Increase the temperature by one using 
//		the post-increment operator and then decrease it by one using 
//		the pre-decrement operator. Display the temperature after every operation.
		
		int temp=35;
		int t1=temp++;
		int t2=--temp;
		System.out.println("value after post-increment: "+t1);
		System.out.println("value after pre-decrement: "+t2);
		
	}
}

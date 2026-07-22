package Polymorphism;

class Ticketbooking {

	int tickets;
	static double price=200;
	static double totalamount;
	static double finalamount;
	boolean isPremium;
	public void bookticket(int tickets) {
		totalamount=tickets*price;
		System.out.println("Total amount for Tickets is: "+totalamount);
	}
	
	public void bookticket(int tickets, boolean isPremium) {
		if(isPremium=true) {
			price=350;
			totalamount=tickets*price;
			System.out.println("Booked premium tickets..!!\n totalamount is: "+totalamount);
		}
		else {
			totalamount=tickets*price;
			price=200;
			System.out.println("Total amount for non premium"+totalamount);
		}
		
		
	}
	
	public void bookticket(int tickets, boolean isPremium, double discount) {
		if(isPremium==true) {
			price=350;
			totalamount=tickets*price;
			double discountamount=totalamount*(discount/100);
			finalamount=totalamount-discountamount;
			System.out.println("final amount to be paid after discount for premium sets: "+finalamount);
		}
		else {
			price=200;
			totalamount=tickets*price;
			double discountamount=totalamount*(discount/100);
			finalamount=totalamount-discountamount;
			System.out.println("final amount to be paid after discount : "+finalamount);
		}
		
		
	}
}

public class MovieTicketBookingSystem {
	public static void main(String[] args) {

		Ticketbooking t=new Ticketbooking();
		t.bookticket(2);
		t.bookticket(3, true);
		t.bookticket(3, true, 20);
	}
}

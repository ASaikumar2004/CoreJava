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
		}
		else {
			price=200;
		}
		totalamount=tickets*price;
		System.out.println("Total amount for premium and non premium: "+totalamount);
	}
	
	public void bookticket(int tickets, boolean isPremium, double discount) {
		if(isPremium==true) {
			price=350;
		}
		else {
			price=200;
		}
		totalamount=tickets*price;
		double discountamount=totalamount*(discount/100);
		finalamount=totalamount-discountamount;
		System.out.println("final amount to be paid after discount is: "+finalamount);
	}
}

public class MovieTicketBookingSystem {
	public static void main(String[] args) {

		Ticketbooking t=new Ticketbooking();
		t.bookticket(2);
		t.bookticket(3, true);
		t.bookticket(3, false, 20);
	}
}

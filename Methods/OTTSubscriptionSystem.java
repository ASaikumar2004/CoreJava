package Methods;

public class OTTSubscriptionSystem {

	int uid;
	String uname;
	String platname;
	String subplan;
	double mprice;
	int months;
	
	double subamount;
	double discount;
	double gst;
	double finalamount;
	
	public OTTSubscriptionSystem(int uid, String uname, String platname,String subplan, double mprice, int months) {
		this.uid=uid;
		this.uname=uname;
		this.platname=platname;
		this.subplan=subplan;
		this.mprice=mprice;
		this.months=months;
		}
	
	public void subscriptionamount() {
		subamount=mprice*months;
	}
	
	public void applydiscount() {
		if(months==12) {
			discount=subamount*0.20;
		}
		else {
			discount=0;
		}
	}
	
	public void gst() {
		gst=(subamount-discount)*0.18;
		finalamount=(subamount-discount)+gst;
	}
	
	public void display() {

		System.out.println("========================================");
	    System.out.println("User ID              : " + uid);
	    System.out.println("User Name            : " + uname);
	    System.out.println("Platform Name        : " + platname);
	    System.out.println("Subscription Plan    : " + subplan);
	    System.out.printf("Monthly Price        : ₹%.2f%n", mprice);
	    System.out.println("Number of Months     : " + months);
	    System.out.printf("Subscription Amount  : ₹%.2f%n", subamount);
	    System.out.printf("Discount             : ₹%.2f%n", discount);
	    System.out.printf("GST (18%%)           : ₹%.2f%n", gst);
	    System.out.printf("Final Amount         : ₹%.2f%n", finalamount);
        System.out.println( );
    }
	public static void main(String[] args) {
		OTTSubscriptionSystem user1 = new OTTSubscriptionSystem(
                101,
                "Sai",
                "Netflix",
                "Premium",
                649,
                12);

        OTTSubscriptionSystem user2 = new OTTSubscriptionSystem(
                102,
                "sivani",
                "Amazon Prime",
                "Standard",
                299,
                6);

        OTTSubscriptionSystem user3 = new OTTSubscriptionSystem(
                103,
                "Anjali",
                "Disney+ Hotstar",
                "Super",
                499,
                12);
        
        user1.subscriptionamount();
        user1.applydiscount();
        user1.gst();
        user1.display();
        
        user2.subscriptionamount();
        user2.applydiscount();
        user2.gst();
        user2.display();
        
        user3.subscriptionamount();
        user3.applydiscount();
        user3.gst();
        user3.display();

	}
}

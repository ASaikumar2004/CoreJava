package Polymorphism;

class Recharge {

    String mobileNumber;
    double rechargeAmount;
    String serviceProvider;
    int validity;
    double cashback;


    Recharge(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = 0;
        this.serviceProvider = "Not Available";
    }

    Recharge(String mobileNumber, double rechargeAmount) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = rechargeAmount;
        this.serviceProvider = "Not Available";
    }

    Recharge(String mobileNumber, double rechargeAmount, String serviceProvider) {
        this.mobileNumber = mobileNumber;
        this.rechargeAmount = rechargeAmount;
        this.serviceProvider = serviceProvider;
    }

    void recharge() {
        validity = 28;
        cashback = 0;
    }

    void recharge(int validity) {
        this.validity = validity;
        cashback = 0;
    }

    void recharge(int validity, double cashback) {
        this.validity = validity;
        this.cashback = cashback;
    }

    void displayRechargeDetails() {
        System.out.println("Mobile Number   : " + mobileNumber);
        System.out.println("Recharge Amount : ₹" + rechargeAmount);
        System.out.println("Service Provider: " + serviceProvider);
        System.out.println("Validity        : " + validity + " days");
        System.out.println("Cashback        : ₹" + cashback);
        System.out.println("---------------------------------");
    }
}

public class MobileRechargeSystem {

    public static void main(String[] args) {

        // Object 1: Mobile number only
        Recharge r1 = new Recharge("9876543210");
        r1.recharge();
        r1.displayRechargeDetails();

        // Object 2: Mobile number and amount
        Recharge r2 = new Recharge("9123456780", 299);
        r2.recharge(56);
        r2.displayRechargeDetails();

        // Object 3: Mobile number, amount, and service provider
        Recharge r3 = new Recharge("9988776655", 499, "Jio");
        r3.recharge(84, 50);
        r3.displayRechargeDetails();
    }
}
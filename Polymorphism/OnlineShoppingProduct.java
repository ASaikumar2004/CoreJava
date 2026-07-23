package Polymorphism;


public class OnlineShoppingProduct {

    String productName;
    double price;
    String category;

    OnlineShoppingProduct(String productName) {
        this.productName = productName;
        this.price = 0.0;
        this.category = "Not Available";
    }

    OnlineShoppingProduct(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.category = "Not Available";
    }

    OnlineShoppingProduct(String productName, double price, String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }
    void display() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println("Category     : " + category);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        // Object using constructor 1
        OnlineShoppingProduct p1 = new OnlineShoppingProduct("Laptop");

        // Object using constructor 2
        OnlineShoppingProduct p2 = new OnlineShoppingProduct("Smartphone", 25000);

        // Object using constructor 3
        OnlineShoppingProduct p3 = new OnlineShoppingProduct("Headphones", 1999, "Electronics");

        // Display details
        p1.display();
        p2.display();
        p3.display();
    }
}


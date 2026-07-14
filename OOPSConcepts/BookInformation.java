package OOPSConcepts;

public class BookInformation {

	int bookid;
	String title;
	String author;
	int price;
	
	public BookInformation() {
		bookid= 101;
		title="Java Programming";
		author="James Gosling";
		price=650;
	}
	
	public void display() {
		System.out.println("BookId: "+bookid);
		System.out.println("title: "+title);
		System.out.println("author: "+author);
		System.out.println("price: "+price);
	}
	
	public static void main(String[] args) {
		BookInformation b=new BookInformation();
		b.display();
	}
}

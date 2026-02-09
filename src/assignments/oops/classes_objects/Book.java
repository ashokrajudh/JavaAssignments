package assignments.oops.classes_objects;

public class Book {

       private String title;
       private String author;
       private double price;

       Book(String title, String author, double price)
       {
             this.title = title;
             this.author = author;
             setPrice(price);
       }


    public static void main(String[] args) {


        Book book1 = new Book("Effective Java", "Joshua Bloch", 500);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 450);

        book1.applyDiscount(10);
        book2.applyDiscount(20);

        book1.displayDetails();
        book2.displayDetails();
    }
    private void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void applyDiscount(double discountPercent) {
        if (discountPercent > 0 && discountPercent <= 100) {
            price = price - (price * discountPercent / 100);
        }
    }

    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("----------------------");
    }
}

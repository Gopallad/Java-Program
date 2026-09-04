
class Book {

    String title;
    int price;

    Book() {

    }

    Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    Book(Book b) {
        this.title = b.title;
        this.price = b.price;
    }

    void display() {
        System.out.println(title + " " + price);
    }

    public static void main(String[] args) {

        Book b = new Book("C Programing ", 900);

        Book b1 = new Book(b);

        b.display();
        b1.display();
    }

}

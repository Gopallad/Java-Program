package CollectionFramworkArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	int id;
	String title;
	String author;

	Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;

	}

	public String toString() {
		return id + " " + title + " " + author;
	}
}

public class LibraryManagementSystem {
	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Library Management System");
			System.out.println("1.Add Book");
			System.out.println("2.Display All");
			System.out.println("3.Search Book");
			System.out.println("4.Remove Book");
			System.out.println("5.update Book");
			System.out.println("6.exit");

			System.out.println("Enter choice");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Book Id: ");
				int id = sc.nextInt();
				System.out.println("Enter Title: ");
				String title = sc.next();
				System.out.println("Enter Author: ");
				String author = sc.next();

				list.add(new Book(id, title, author));

				System.out.println("Book Added");
				break;

			case 2:
				if (list.isEmpty()) {
					System.out.println("No books Available");
				} else {
					for (Book b : list) {
						System.out.println(b);
					}
				}
				break;

			case 3:
				System.out.println("Enter Book Id: ");
				id = sc.nextInt();
				boolean found = false;

				for (Book b : list) {
					if (b.id == id) {
						System.out.println("Found" + id);
						found = true;
						break;
					}
				}
				if (!found) {
					System.out.println("Book Not found");
				}
				break;

			case 4:
				System.out.println("Enter Book Id: ");
				id = sc.nextInt();

				boolean removed = list.removeIf(b -> b.id == id);
				if (removed) {
					System.out.println("Book Removed!");
				} else {
					System.out.println("Book Not found ");
				}
				break;

			case 5:
				System.out.println("Enter Book ID: ");
				id = sc.nextInt();
				boolean updated = false;

				for (Book b : list) {

					if (b.id == id) {
						System.out.println("Enter new Title: ");
						b.title = sc.next();
						updated = true;
						System.out.println("Title Updated ");
						break;
					}

				}
				if(!updated) {
					System.out.println("Book not Found");
				}
				break;
				
			case 6 :
				System.out.println("Exiting...");
				System.exit(0);
				
				default: 
					System.out.println("invalid choice!");
			}

		}

	}
}

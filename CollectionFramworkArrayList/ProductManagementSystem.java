package CollectionFramworkArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Product {

	int id;
	String name;
	double price;

	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;

	}

	public String toString() {
		return id + " " + name + " " + price;
	}
}

public class ProductManagementSystem {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nproduct System");
			System.out.println("1. Add product");
			System.out.println("2. Display Add");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. update Price");
			System.out.println("6. Exit");

			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter price: ");
				double price = sc.nextDouble();

				list.add(new Product(id, name, price));
				break;

			case 2:
				for (Product p : list) {
					System.out.println(p);
				}
				break;

			case 3:
				System.out.println("Enter ID: ");
				id = sc.nextInt();
				for (Product p : list) {
					if (p.id == id) {
						System.out.println("Found" + p);
					}
				}
				break;

			case 4:
				System.out.println("Enter Id: ");
				id = sc.nextInt();
				list.removeIf(p -> p.id == id);
				break;

			case 5:
				System.out.println("Enter ID: ");
				id = sc.nextInt();
				for (Product p : list) {
					if (p.id == id) {
						System.out.println("Enter new price: ");
						p.price = sc.nextDouble();
					}
				}
				break;

			case 6:
				System.exit(0);

			}
		}

	}
}

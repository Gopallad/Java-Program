package CollectionFramworkArrayList;

import java.util.*;

class Order {
	int orderId;
	String customerName;
	double amount;

	// Constructor
	Order(int orderId, String customerName, double amount) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.amount = amount;
	}

	public String toString() {
		return orderId + " " + customerName + " " + amount;
	}
}

public class OnlineOrderManagement {
	public static void main(String[] args) {

		ArrayList<Order> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n--- Order Management System ---");
			System.out.println("1. Add Order");
			System.out.println("2. Display All Orders");
			System.out.println("3. Search Order");
			System.out.println("4. Cancel Order");
			System.out.println("5. Update Amount");
			System.out.println("6. Total Revenue");
			System.out.println("7. Exit");

			System.out.print("Enter choice: ");
			int ch = sc.nextInt();

			switch (ch) {

			case 1:
				System.out.print("Enter Order ID: ");
				int id = sc.nextInt();
				System.out.print("Enter Customer Name: ");
				String name = sc.next();
				System.out.print("Enter Amount: ");
				double amt = sc.nextDouble();

				list.add(new Order(id, name, amt));
				System.out.println("Order Added!");
				break;

			case 2:
				if (list.isEmpty()) {
					System.out.println("No orders found!");
				} else {
					for (Order o : list) {
						System.out.println(o);
					}
				}
				break;

			case 3:
				System.out.print("Enter Order ID: ");
				id = sc.nextInt();
				boolean found = false;

				for (Order o : list) {
					if (o.orderId == id) {
						System.out.println("Found: " + o);
						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("Order not found!");
				}
				break;

			case 4:
				System.out.print("Enter Order ID: ");
				id = sc.nextInt();

				boolean removed = list.removeIf(o -> o.orderId == id);

				if (removed) {
					System.out.println("Order Cancelled!");
				} else {
					System.out.println("Order not found!");
				}
				break;

			case 5:
				System.out.print("Enter Order ID: ");
				id = sc.nextInt();
				boolean updated = false;

				for (Order o : list) {
					if (o.orderId == id) {
						System.out.print("Enter new amount: ");
						o.amount = sc.nextDouble();
						updated = true;
						System.out.println("Amount Updated!");
						break;
					}
				}

				if (!updated) {
					System.out.println("Order not found!");
				}
				break;

			case 6:
				double total = 0;
				for (Order o : list) {
					total += o.amount;
				}
				System.out.println("Total Revenue: " + total);
				break;

			case 7:
				System.out.println("Exiting...");
				System.exit(0);

			default:
				System.out.println("Invalid choice!");
			}
		}
	}
}
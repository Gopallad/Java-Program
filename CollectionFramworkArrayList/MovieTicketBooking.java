package CollectionFramworkArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Movie {
	int id;
	String name;
	int seat;

	Movie(int id, String name, int seat) {
		this.id = id;
		this.name = name;
		this.seat = seat;
	}

	public String toString() {
		return id + " " + name + " " + seat;
	}
}

public class MovieTicketBooking {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Moive Booking System");
			System.out.println("1.Add Movie");
			System.out.println("2.Display All Movies");
			System.out.println("3.Book Ticket");
			System.out.println("4.Cancel Ticket");
			System.out.println("5.Search Movie");
			System.out.println("6.Available Movies");
			System.out.println("7.Exit");

			System.out.println("Enter Choice");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter Moive Id: ");
				int id = sc.nextInt();
				System.out.println("Enter Moive Name: ");
				String name = sc.next();
				System.out.println("Enter Seat: ");
				int seat = sc.nextInt();

				list.add(new Movie(id, name, seat));
				System.out.println("Moive added ");
				break;

			case 2:
				for (Movie m : list) {
					System.out.println(m);
				}
				break;

			case 3:
				System.out.println("Enter Movie ID: ");
				id = sc.nextInt();
				boolean booked = false;

				for (Movie m : list) {
					if (m.id == id && m.seat > 0) {
						m.seat--;
						booked = true;
						System.out.println("Ticket Booked");
						break;
					}
				}
				if (!booked) {
					System.out.println("Booking Failed");
				}
				break;

			case 4:
				System.out.println("Enter Movie ID: ");
				id = sc.nextInt();

				for (Movie m : list) {
					if (m.id == id) {
						m.seat++;
						System.out.println("Ticket Cancelled");
						break;
					}
				}
				break;
			case 5:
				System.out.println("Enter Movie Id: ");
				id = sc.nextInt();
				for (Movie m : list) {
					if (m.id == id) {
						System.out.println("Found: " + m);
					}
				}
				break;

			case 6:
				System.out.println("Available Movies: ");
				for (Movie m : list) {
					if (m.seat > 0) {
						System.out.println(m);
					}
				}
				break;

			case 7:
				System.exit(0);

			default:
				System.out.println("Invalid Choice: ");
			}
		}
	}
}
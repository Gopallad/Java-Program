package CollectionFramworkArrayList;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	int id;
	String name;
	double marks;

	// constructor
	Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + marks;
	}
}

public class StudentManagementarraylist {
	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\nStudent Management System");
			System.out.println("1.Add student");
			System.out.println("2.Display All");
			System.out.println("3.Search by ID");
			System.out.println("4.Remove by Id");
			System.out.println("5.Update Marks");
			System.out.println("6.Exit");

			System.out.println("Enter Choice");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter marks: ");
				double marks = sc.nextDouble();

				list.add(new Student(id, name, marks));
				break;

			case 2:
				if (list.isEmpty()) {
					System.out.println("No student found");
				} else {
					for (Student s : list) {
						System.out.println(s);
					}
				}
				break;

			case 3:
				System.out.println("Enter Id to serach: ");
				id = sc.nextInt();
				boolean found = false;

				for (Student s : list) {
					if (s.id == id) {
						System.out.println("Found " + s);
						found = true;
						break;
					}
				}
				if (!found)
					System.out.println("not found");
				break;
			case 4:
				System.out.println("Enter Id to remove");
				id = sc.nextInt();

				boolean removed = list.removeIf(s -> s.id == id);

				if (removed) {
					System.out.println("Student Removed");

				} else {
					System.out.println("Student Not Found!");
				}
				break;

			case 5:
				System.out.println("Enter Id to update: ");
				id = sc.nextInt();
				boolean updated = false;

				for (Student s : list) {
					if (s.id == id) {
						System.out.println("Enter new marks: ");
						s.marks = sc.nextDouble();
						updated = true;
						System.out.println("Marks updated");
						break;
					}
				}
				if (!updated) {
					System.out.println("student not found");
				}
				break;

			case 6:
				System.out.println("Exiting....");
				System.exit(0);

			default:
				System.out.println("Invalid Choice!");
			}
		}

	}
}

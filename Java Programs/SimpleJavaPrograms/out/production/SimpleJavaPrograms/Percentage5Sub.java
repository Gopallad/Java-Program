
import java.util.Scanner;

public class Percentage5Sub {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("'Marks of Suject'");
        System.out.println("Enter the Marathi marks: ");
        int m = sc.nextInt();
        System.out.println("Enter the English Marks: ");
        int e = sc.nextInt();

        System.out.println("Enter the Maths marks: ");
        int t = sc.nextInt();

        System.out.println("Enter the History marks: ");
        int h = sc.nextInt();

        System.out.println("Enter the Geography marks: ");
        int g = sc.nextInt();

        double percentage = (m + e + t + h + g) / 500.0 * 100;
        System.out.println("Pencentage: " + percentage + "%");
    }
}

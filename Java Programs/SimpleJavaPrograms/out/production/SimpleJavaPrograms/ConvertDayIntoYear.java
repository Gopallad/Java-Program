
import java.util.Scanner;

public class ConvertDayIntoYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Days: ");
        int days = sc.nextInt();

        int years = days / 365;
        days = days % 365;

        int weeks = days / 7;
        days = days % 7;

        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}

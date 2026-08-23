
import java.util.Scanner;

public class KilometertoMeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter kilometer: ");
        double km = sc.nextDouble();

        double meter = km * 1000;
        System.out.println("Meter: " + meter);
    }
}


import java.util.Scanner;

public class CelciusIntoFahrenheit {

    static int celcius(int c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Celcius: ");
        int c = sc.nextInt();

        int fahrenheit = celcius(c);

        System.out.println("fahrenheit: " + fahrenheit+"F");

    }
}

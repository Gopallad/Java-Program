
import java.util.Scanner;

public class CountTotalCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count++;
        }
        System.out.println(count);
    }
}


import java.util.Scanner;

public class FindFirstOccurrenceOfCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String a = sc.nextLine();

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ch) {
                System.out.println("First Occurrence at Index: " + i);
                break;
            }
        }
    }
}

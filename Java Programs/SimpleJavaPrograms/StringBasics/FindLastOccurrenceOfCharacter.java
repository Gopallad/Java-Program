
import java.util.Scanner;

public class FindLastOccurrenceOfCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String a = sc.nextLine();

        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);

        for (int i = a.length() - 1; i >= 0; i--) {

            if (a.charAt(i) == ch) {
                System.out.println("Last Occurrence at index: " + i);
                break;
            }
        }
    }
}

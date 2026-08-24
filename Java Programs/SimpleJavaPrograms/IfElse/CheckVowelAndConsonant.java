
import java.util.Scanner;

public class CheckVowelAndConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Check the Character vowel and consonant: ");

        System.out.println("Enter a Character: ");
        int ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

    }
}

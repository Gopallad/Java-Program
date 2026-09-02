
import java.util.Scanner;

public class CountVowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String: ");
        String a = sc.nextLine();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < a.length(); i++) {

            char ch = a.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }
}


import java.util.Scanner;

public class FirstRepeatingChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println("First Repeating character: " + ch);
                break;
            }
        }

    }
}

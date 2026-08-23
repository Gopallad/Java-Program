
import java.util.Scanner;

public class LowerToUpper {

    static char convertUpperCase(char ch) {
        return Character.toUpperCase(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Lowercase Character: ");
        char ch = sc.next().charAt(0);

        char upper = Character.toUpperCase(ch);
        System.out.println(upper);

        char upperr = convertUpperCase(ch);
        System.out.println(upperr);
    }
}

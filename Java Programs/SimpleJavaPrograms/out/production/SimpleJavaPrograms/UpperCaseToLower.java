
import java.util.Scanner;

public class UpperCaseToLower {

    static char convertTolower(char ch) {
        return Character.toLowerCase(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter UpperCase Character: ");
        char ch = sc.next().charAt(0);

        char lower = Character.toLowerCase(ch);

        System.out.println(lower);

        char lowercase = convertTolower(ch);
        System.out.println(lowercase);

    }
}


import java.util.Scanner;

public class FindASCII {

    static int findASCII(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);

        int ASCII = findASCII(ch);

        System.out.println(ASCII);
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first String: ");
        String str1 = sc.nextLine();

        System.out.println("Enter a Second String");
        String str2 = sc.nextLine();

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("Anagram: ");
        } else {
            System.out.println("Not Anagram");
        }

    }
}

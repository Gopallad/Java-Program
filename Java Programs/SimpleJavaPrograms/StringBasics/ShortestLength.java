
import java.util.Scanner;

public class ShortestLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String shortest = words[0];

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        System.out.println("Shortest word: " + shortest);
    }
}


import java.util.Scanner;

public class CountPositiveElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = {1, 2, 3, 4, -9, 5, 0, -4, 6};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                System.out.println("Positive Elements: " + a[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}

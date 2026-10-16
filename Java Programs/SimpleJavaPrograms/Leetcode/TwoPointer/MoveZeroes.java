
import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] a) {

        int j = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] != 0) {

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;

                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 0, 1, 0, 3};

        System.out.println(Arrays.toString(a));

        moveZeroes(a);

        System.out.println(Arrays.toString(a));

    }
}

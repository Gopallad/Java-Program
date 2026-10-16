
public class RemoveDouplicate {

    public static int removeDuplicate(int[] a) {

        if (a.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < a.length; j++) {

            if (a[j] != a[i]) {
                i++;

                a[i] = a[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[] a = {1, 1, 2, 2, 3, 3};

        int k = removeDuplicate(a);
        System.out.println("Unique Count: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

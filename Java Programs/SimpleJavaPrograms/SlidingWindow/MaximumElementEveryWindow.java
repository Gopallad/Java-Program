
public class MaximumElementEveryWindow {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 4, 6};

        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {

                if (arr[j] > max) {

                    max = arr[j];
                }
            }
            System.out.println(max);
        }
    }
}

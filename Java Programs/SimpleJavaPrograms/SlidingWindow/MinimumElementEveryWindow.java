
public class MinimumElementEveryWindow {

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 3, 4};

        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {

            int min = arr[i];

            for (int j = i; j < i + k; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                }
            }
            System.out.println("Min: " + min);
        }

    }
}

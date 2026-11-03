
import java.util.Arrays;
import java.util.Scanner;

public class FindLeastFrequentCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Array:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int minCount = arr.length + 1;
        int leastFrequent = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count < minCount) {
                minCount = count;
                leastFrequent = arr[i];
            }
        }

        System.out.println("Least Frequent Element: " + leastFrequent);
        System.out.println("Frequency: " + minCount);
    }
}

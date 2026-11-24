public class Avg {

    public static double avg(int[] arr) {

        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
        }
        return (double) sum / n;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Avg: " + avg(arr));
    }
}

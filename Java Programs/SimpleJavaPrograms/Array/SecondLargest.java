public class SecondLargest {

    public static int secondlargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        int result = secondlargest(arr);

        System.out.println("Second Largest: " + result);
    }
}

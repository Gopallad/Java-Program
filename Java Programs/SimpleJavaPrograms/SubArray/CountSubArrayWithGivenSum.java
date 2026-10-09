
import java.util.HashMap;

public class CountSubArrayWithGivenSum {

    public static int countSubarray(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            prefixSum = prefixSum + arr[i];

            if (map.containsKey(prefixSum - target)) {

                count = count + map.get(prefixSum - target);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 3, 2, 1, 3, 5, 6};

        int target = 9;

        System.out.println(countSubarray(arr, target));
    }
}

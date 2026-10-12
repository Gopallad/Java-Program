
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int num = target - arr[i];

            if (map.containsKey(num)) {
                return new int[]{map.get(num), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};

    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        TwoSum a = new TwoSum();

        int[] ans = a.twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }
}

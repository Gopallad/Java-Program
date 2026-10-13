
import java.util.*;

public class TopKfrequentElement {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b)
                -> map.get(b) - map.get(a));

        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        TopKfrequentElement obj = new TopKfrequentElement();

        int[] ans = obj.topKFrequent(nums, k);

        System.out.println(Arrays.toString(ans));
    }
}

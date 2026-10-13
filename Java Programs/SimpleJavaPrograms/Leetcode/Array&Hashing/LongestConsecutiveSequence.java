
import java.util.HashSet;

public class LongestConsecutiveSequence {

    public int longestConsecutiveSequence(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            set.add(arr[i]);
        }
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (!set.contains(num - 1)) {

                int count = 1;

                while (set.contains(num + 1)) {
                    num++;
                    count++;
                }
                if (count > longest) {
                    longest = count;
                }
            }
        }
        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();

        System.out.println(obj.longestConsecutiveSequence(arr));
    }
}

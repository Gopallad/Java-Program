
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersectionTwoArray(int[] a, int[] b) {

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < a.length; i++) {

            set.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {

            if (set.contains(b[i])) {
                result.add(b[i]);
            }
        }

        int[] ans = new int[result.size()];

        int i = 0;

        for (Integer num : result) {
            ans[i] = num;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] a = {1, 2};
        int[] b = {1};

        IntersectionOfTwoArrays obj = new IntersectionOfTwoArrays();

        int[] ans = obj.intersectionTwoArray(a, b);

        System.out.println(Arrays.toString(ans));
    }
}

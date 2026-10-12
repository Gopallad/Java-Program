//217 Contains Duplicate  using hashset

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2};

        ContainsDuplicate a = new ContainsDuplicate();

        boolean ans = a.containsDuplicate(arr);

        System.out.println(ans);

    }

}

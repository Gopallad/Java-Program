
import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (n > m) {
            return false;
        }

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < n; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        for (int i = n; i < m; i++) {

            if (Arrays.equals(arr1, arr2)) {
                return true;
            }

            arr2[s2.charAt(i) - 'a']++;

            arr2[s2.charAt(i - n) - 'a']--;
        }

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = checkInclusion(s1, s2);

        System.out.println(result);
    }
}


public class ValidPalindrome {

    public static boolean isValidPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char a = Character.toLowerCase(s.charAt(left));
            char b = Character.toLowerCase(s.charAt(right));

            if (a != b) {
                return false;
            }

            left++;
            right--;

        }
        return true;

    }

    public static void main(String[] args) {

        String a = "madam";

        if (isValidPalindrome(a)) {
            System.out.println("ValidPalindrome");
        } else {
            System.out.println("Not a valid Palindrome");
        }

    }
}


public class LongestSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";

        String current = "";

        int max = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (current.indexOf(ch) != -1) {
                current = current.substring(current.indexOf(ch) + 1);
            }
            current = current + ch;

            if (current.length() > max) {
                max = current.length();
            }
        }
        System.out.println("Longest Length: " + max);
    }
}

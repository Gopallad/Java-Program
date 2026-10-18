//209 

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum = sum + nums[right];

            while (sum >= target) {
                int length = right - left + 1;

                minLength = Math.min(minLength, length);

                sum = sum - nums[left];
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }

    public static void main(String[] args) {

        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};

        System.out.println(minSubArrayLen(target, nums));
    }
}

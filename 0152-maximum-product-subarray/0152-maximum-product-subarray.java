class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int x = nums[i];

            int temp = max;

            max = maxOf(x, max * x, min * x);
            min = minOf(x, temp * x, min * x);

            if (max > ans) {
                ans = max;
            }
        }

        return ans;
    }

    public static int maxOf(int a, int b, int c) {
        int max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }

    public static int minOf(int a, int b, int c) {
        int min = a;

        if (b < min)
            min = b;

        if (c < min)
            min = c;

        return min;
    }
}

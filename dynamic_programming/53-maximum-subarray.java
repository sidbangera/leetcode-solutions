class Solution {
    public int maxSubArray(int[] nums) {

        int sum = nums[0];
        int windowSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i],sum + nums[i]);
            windowSum = Math.max(windowSum, sum);
        }
        return windowSum;
    }
}
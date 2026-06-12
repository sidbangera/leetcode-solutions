class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num:nums){
            if(num>max1){
                max2 = max1;
                max1 = num;
            }
            else if(num>max2){
                max2 = num;
            }
            if(num<min){
                min = num;
            }
        }
        return max1+max2 - min;
    }
}

/*class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n-1] + nums[n-2] - nums[0];
    }
}
    */
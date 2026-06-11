class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int diff=0,min=Integer.MAX_VALUE;
        boolean found=false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] == 1 && nums[j]==2)
                {diff = Math.abs(i-j);
                min = Math.min(min,diff);
                found = true;
                }
                
            }
        }
        return found ? min:-1;
    }
}
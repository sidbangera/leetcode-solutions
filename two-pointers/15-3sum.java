class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);

       List<List<Integer>> finalList = new ArrayList<>();

       int fixed = 0;
       int left;
       int right = nums.length - 1;
       int sum;

       for(fixed=0;fixed<nums.length - 2;fixed++)
       {    left = fixed+1;
            right = nums.length - 1;
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]) {
                continue;
            }
            while(left<right)
            {
                sum = nums[fixed] + nums[left] + nums[right];
                if(sum == 0)
                {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[fixed]); tempList.add(nums[left]); 
                    tempList.add(nums[right]);
                    finalList.add(tempList);

                    left++;
                    right--;

                    while(left<right && nums[left] == nums[left-1])
                    {
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1])
                    {
                        right--;
                    }
                }
                else if(sum<0)
                {
                    left++;
                }
                else
                {
                    right--;
                    
                }
               
            }
       } 
       return finalList;
    }
}
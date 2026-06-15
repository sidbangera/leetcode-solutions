class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) count++;
            }
        }
        return count;
    }
}

/*
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int res = 0;
        
        for (int num : nums) {
            // Every time we see a number again, it forms a new pair 
            // with all its previously recorded occurrences.
            res += freq[num];
            freq[num]++;
        }
        
        return res;
    }
}
*/
//NOTE: While O(n) is satisfied, constant extra space O(1) is not solved

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int number:nums){
            map.put(number,map.getOrDefault(number,0)+1);
        }
        for(int number:nums){
            if(map.get(number) == 1) return number;
        }
        return -1;
    }
}
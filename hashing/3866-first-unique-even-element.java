//Solved using a HashMap approach. 

class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int number:nums){
            if(number % 2 == 0 && map.get(number) == 1){
                    return number;
            }
        }
        return -1;
    }
}
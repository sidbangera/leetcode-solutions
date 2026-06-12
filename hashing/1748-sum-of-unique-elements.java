//HashMap Implementation

class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        // if(map.size()>1){
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                if(entry.getValue() == 1){
                    list.add(entry.getKey());
                }
            }
        // }
        int sum = 0;
        for(int num:list){
            sum += num;
        }
        return sum;
    }
}
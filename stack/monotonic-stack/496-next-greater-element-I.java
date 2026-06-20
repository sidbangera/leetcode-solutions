class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        var map = new HashMap<Integer,Integer>();
        var stack = new ArrayDeque<Integer>();
        for(int num:nums2){
            while(!stack.isEmpty() && num>stack.peek()){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        int res[] = new int[nums1.length];
        for(int i=0;i<res.length;i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}
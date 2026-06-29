class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 != 0) count++;
            else count = 0;
            maxCount = Math.max(count,maxCount);
        }
        return maxCount>=3;
    }
}
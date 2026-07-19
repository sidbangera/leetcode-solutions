class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left = 1; int right = Integer.MIN_VALUE; 
       for(int num:piles){
        right = Math.max(right,num);
       }
    int min = Integer.MAX_VALUE;
    while(left<=right){
        int mid = left + (right-left)/2;
        long totalHours = 0;
            for(int i=0;i<piles.length;i++){
                int hours = piles[i]/mid;
                if(piles[i] % mid != 0){
                    hours++;
                }
                totalHours += hours;
            }
            if(totalHours<=h) {
                min = Math.min(min,mid);
                right = mid-1;
            }
            else left = mid+1;
       }
       return min;
    }
}
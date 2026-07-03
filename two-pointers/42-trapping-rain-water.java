class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int total = 0;

        while(left<right){
            if(leftMax <= rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                total += leftMax - height[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                total += rightMax - height[right];
            }
        }
        return total;
    }
}


/* Solved using Prefix Maximum + Suffix Maximum
- Time: O(n)
- Space: O(n)

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }
        
        int total = 0;
        
        for(int i=0;i<n;i++){
            int sum = Math.min(leftMax[i],rightMax[i]) - height[i];
            total += sum;
        }
        return total;
    }
}
*/
//Solved using DP - discovered recursion at first and then 
class Solution {
    public int climbStairs(int n) {
       if(n == 1) return 1;
       if(n == 2) return 2;
    //    if(n == 3) return 3;
    int prev2 = 1,prev1 = 2,curr=0,temp=0;
    if(n>=3){
        for(int i=3;i<=n;i++){
            curr = prev2+prev1;
            temp = prev1;
            prev1 = curr;
            prev2 = temp;
        }
    }  
    return curr;
    }
}
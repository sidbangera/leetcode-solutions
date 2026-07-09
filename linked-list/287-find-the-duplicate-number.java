/*
Alternative approaches:

1. Brute Force
   Time: O(n²)
   Space: O(1)

2. Sorting
   Time: O(n log n)
   Space: O(1) or O(log n)

3. HashSet
   Time: O(n)
   Space: O(n)

4. HashMap
   Time: O(n)
   Space: O(n)

5. Boolean Array
   Time: O(n)
   Space: O(n)

6. Floyd's Cycle Detection (Optimal)
   Time: O(n)
   Space: O(1)
*/


class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        int temp = 0;
        while(temp != slow){
            temp = nums[temp];
            slow = nums[slow];
        }
        return temp;
    }
}
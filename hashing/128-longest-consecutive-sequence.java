class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int max = 0;
        int length = 0;
        int current;

        for(int i:nums)
        {
            set.add(i);
        }

        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                current = num;
                length = 1;
                while(set.contains(current+1))
                {
                    current++;
                    length++;
                }

                max = Math.max(max,length);
            }
        }

        return max;
    }
}
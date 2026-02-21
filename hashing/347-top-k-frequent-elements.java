class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i:nums)
        {
            if(!map.containsKey(i))
            {
                map.put(i,1);
            }
            else
            {
                map.put(i,map.get(i)+1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i=0;i<k;i++)
        {
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
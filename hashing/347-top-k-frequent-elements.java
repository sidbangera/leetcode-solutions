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

/*Added HashMap + Heap Solution O(n log k)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int num:map.keySet()){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        for(int i=k-1;i>=0;i--){
            res[i] = pq.poll();
        }
        return res;
    }
}
*/

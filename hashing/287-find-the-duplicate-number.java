import java.util.HashSet;

//HashSet Solution [O(n) Time, O(n) Space]
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }
}

//HashMap Solution [O(n) Time, O(n) Space]
class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }
}


/*Boolean Array Solution
import java.util.HashMap;

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
       boolean[] visited = new boolean[nums.length+1];

       for(int num: nums){
            if(visited[num] == true) return num;
            else{
                visited[num] = true;
            }      
       }
       return 0;
    }
}
*/
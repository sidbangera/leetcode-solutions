/*
Solution 1 O(n logn)
class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        // prefix[1] = gain[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + gain[i-1];
        }
        Arrays.sort(prefix);
    // for(int num:prefix) System.out.println(num);
        return prefix[prefix.length-1];
}
}
*/

//Solution 2 O(1)
class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude=0;int currentAltitude=0;
        for(int netGain:gain){
            currentAltitude += netGain;
            maxAltitude = Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }
}

/*
Solution 3 O(n)
class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length + 1];
        prefix[0] = 0;
        int max = 0;
        
        for (int i = 0; i < gain.length; i++) {
            prefix[i + 1] = prefix[i] + gain[i];
            max = Math.max(max, prefix[i + 1]);
        }
        
        return max;
    }
}
 */
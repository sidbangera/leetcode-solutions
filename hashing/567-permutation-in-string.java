//HashMap + Sliding Window Approach

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm1 = new HashMap<>();
        for(char ch:s1.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        int left=0;
        HashMap<Character,Integer> hm2 = new HashMap<>();
        for(int right=0;right<s2.length();right++){
            hm2.put(s2.charAt(right),hm2.getOrDefault(s2.charAt(right),0)+1);
            if(right-left+1 > s1.length()){
               hm2.put(s2.charAt(left),hm2.getOrDefault(s2.charAt(left),0)-1);
               if(hm2.get(s2.charAt(left)) == 0) hm2.remove(s2.charAt(left));
               left++;
               
            }
            // hm2.put(s2.charAt(right),hm2.getOrDefault(s2.charAt(right),0)+1);
            if(right-left+1 == s1.length()){
                if(hm1.equals(hm2)) return true;
            }            
                
        }
        return false;
    }
}
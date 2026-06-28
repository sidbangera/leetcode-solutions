class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq1 = new int[26];

        for(char ch : p.toCharArray()){
            freq1[ch - 'a']++;
        }
        int left = 0;
        int[] freq2 = new int[26];
        var list = new ArrayList<Integer>();
        for(int right=0;right<s.length();right++){
            freq2[s.charAt(right) - 'a']++;
            if(right-left+1 > p.length()){
                freq2[s.charAt(left) - 'a']--;
                left++;
            }
            if(right-left+1 == p.length()){
                if(Arrays.equals(freq1,freq2)){
                    list.add(left);
                }
            }
        }
        return list;
    }
}
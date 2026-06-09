class Solution {
    public int firstMatchingIndex(String s) {
        int j = s.length() - 1;
        int i=0;
        while(i<=j){
            if (s.charAt(i) == s.charAt(j)) return i;
            i++;
            j--;  
        }
        return -1;
    }
}
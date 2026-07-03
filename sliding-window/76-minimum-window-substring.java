class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        HashMap<Character,Integer> window = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();

        for(char ch : t.toCharArray()){
            need.put(ch,need.getOrDefault(ch,0)+1);
        }

        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int satisfied = 0;
        int required = need.size();
        int start = 0;

    for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            window.put(ch,window.getOrDefault(ch,0)+1);
            if (need.containsKey(ch) &&
                window.get(ch).equals(need.get(ch))) {
                satisfied++;
            }
            while(satisfied == required){
                int currentWindow = right-left+1;
                if(currentWindow<minLength){
                    minLength = currentWindow;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window.put(leftChar,window.getOrDefault(leftChar,0)-1);
                if(window.getOrDefault(leftChar,0) < need.getOrDefault(leftChar,0))
                    satisfied--;
                left++;
            }
    }
    return (minLength == Integer.MAX_VALUE)?(""):(s.substring(start,start+minLength));
    }
}
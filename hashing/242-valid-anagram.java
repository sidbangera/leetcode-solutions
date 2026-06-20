class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        if(s.length() != t.length())
        {
            return false;
        }

        for(char c:s.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char c:t.toCharArray())
        {
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        return map1.equals(map2);


    }
}


/*
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!map.containsKey(ch)) return false;

            int count = map.get(ch);

            if(count == 1){
                map.remove(ch);
            }
            else
            {
                map.put(ch,map.get(ch)-1);
            }
        }

        return map.isEmpty();
    }
}
*/
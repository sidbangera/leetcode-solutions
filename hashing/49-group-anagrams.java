class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String copyarr[] = strs.clone();

        for(int i=0;i<copyarr.length;i++)
        {
            char[] chararr = copyarr[i].toCharArray();
            Arrays.sort(chararr);
            copyarr[i] = new String(chararr);
        }

        HashMap<String,List<String>> index = new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            String key = copyarr[i];
            String word = strs[i];

            if(!index.containsKey(key))
            {
                List<String> tempList = new ArrayList<>();
                tempList.add(word);
                index.put(key,tempList);
            }
            else
            {
                index.get(key).add(word);
            }
        }
        List<List<String>> mainList = new ArrayList<>(index.values());
        return mainList;
    }
}
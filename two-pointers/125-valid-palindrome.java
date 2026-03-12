class Solution {
    String removeStuff(String x)
    {
       String y =  x.replace(",","").replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "").trim().toLowerCase();
        return y;
    }
    public boolean isPalindrome(String s) {
        if (s.isEmpty())
            return true;
       String work = removeStuff(s);
        int left = 0;
        int right = work.length() - 1;

        while(left<right)
        {
            if(work.charAt(left) != work.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
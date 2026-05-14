// Pattern: Stack
// Time: O(n)
// Space: O(n)
// Key Idea:
// Push opening brackets.
// Closing brackets must match the latest unmatched opening bracket.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '[') stk.push(ch);
            else{
                if(stk.isEmpty()) return false;
                else{
                    char top = stk.pop();
                    if(ch == ')' && top != '(' ||
                       ch == '}' && top != '{' || 
                       ch == ']' && top != '[')
                       return false;
                }
            }
        }
      return stk.isEmpty();  
    }
}
    class Solution {
        public String removeDuplicates(String s) {
            ArrayDeque<Character> stk = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            for(char ch:s.toCharArray()){
                
                if(!stk.isEmpty() && stk.peek() == ch) {
                    stk.pop();
                }
                else{
                    stk.push(ch);
                }
            } 
            while(!stk.isEmpty()){
                sb.append(stk.pop());
            }
            return sb.reverse().toString();
        }
    }
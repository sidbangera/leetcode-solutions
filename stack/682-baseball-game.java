class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer> numStk = new ArrayDeque<>();
        for(String s: operations){
            if(s.equals("C") && !numStk.isEmpty()){
                numStk.pop();
            }
            else if(s.equals("D") && !numStk.isEmpty()){
                int res = 2* numStk.peek();
                numStk.push(res);
            }
            else if(s.equals("+") && !numStk.isEmpty()){
                int op2 = numStk.pop();
                int op1 = numStk.pop();
                int res = op1 + op2;
                numStk.push(op1);
                numStk.push(op2);
                numStk.push(res);
            }
            else{
                numStk.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(!numStk.isEmpty()){
            sum += numStk.pop();
        }
    return sum;
    }
}
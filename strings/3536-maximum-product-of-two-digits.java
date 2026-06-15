class Solution {
    public int maxProduct(int n) {
        int max = 0; int prod = 1;
        String number = String.valueOf(n);
        for(int i=0;i<number.length();i++){
            for(int j=i+1;j<number.length();j++){
                prod = (number.charAt(i) - '0') * (number.charAt(j) - '0');
                max = Math.max(max,prod);
            }
        }
        return max;
    }
}
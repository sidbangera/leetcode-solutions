class Solution {
    public int findComplement(int num) {
        StringBuilder bin = new StringBuilder(Integer.toBinaryString(num));
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i) == '0') bin.setCharAt(i,'1');
            else bin.setCharAt(i,'0');
        }
        return Integer.parseInt(bin.toString(),2);
    }
}
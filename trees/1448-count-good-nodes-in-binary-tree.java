class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {
       check(root,Integer.MIN_VALUE);
       return count;
    }
    void check(TreeNode root,int maxSoFar){
        if(root == null) return;
        if(root.val>=maxSoFar) {
            count++;
        }
        maxSoFar = Math.max(root.val,maxSoFar);
        check(root.left,maxSoFar);
        check(root.right,maxSoFar);
    }
}
class Solution {
    public boolean isValidBST(TreeNode root) {
       return isBinary(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean isBinary(TreeNode root,long low,long high){
        if(root == null) return true;
        if(root.val<=low || root.val>=high) return false;
        return isBinary(root.left,low,root.val) && isBinary(root.right,root.val,high); 
    }
}
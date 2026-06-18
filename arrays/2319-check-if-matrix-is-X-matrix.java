class Solution {
    public boolean checkXMatrix(int[][] grid) {
        boolean isX = true;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if((i==j) || (i+j == grid.length-1)) isX = true;
                else isX = false;

                if(isX){
                    if(grid[i][j] == 0) return false;
                }
                else{
                    if(grid[i][j] != 0) return false;
                }
            }
        }
        return true;
    }
}
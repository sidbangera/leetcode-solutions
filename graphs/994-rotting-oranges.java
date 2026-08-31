class Solution {
    public int orangesRotting(int[][] grid){
        int fresh = 0;
        Queue<int[]> queue = new LinkedList<>();
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col] == 1) fresh++;
                if(grid[row][col] == 2){
                    queue.offer(new int[]{row,col});
                }
            }
        }
        if(fresh == 0){
            return 0;
        }
        int time = -1;
        int[][] directions = {
                    {-1,0},
                    {1,0},
                    {0,-1},
                    {0,1}
                };
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];

                
                for(int[] dir:directions){
                    int nr = r+dir[0];
                    int nc = c+dir[1];
                    if(nr<0 || nr>=grid.length ||
                    nc<0 || nc>=grid[0].length) continue;
                    if(grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        fresh--;
                        queue.offer(new int[]{nr,nc});
                    }
                }
            }
            time++;
        }
        return (fresh>0)?-1:time;
    }
}
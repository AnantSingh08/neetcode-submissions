class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int [][] visited = new int[rows][cols];
        int maxArea = 0;
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(visited[i][j]==0 && grid[i][j] == 1) {
                    int area = bfs(grid, visited, i, j);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    private int bfs(int[][] grid, int[][] visited, int row, int col) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col});
        visited[row][col] = 1;
        int area = 1;
        int[] dirR = {-1,1,0,0};
        int[] dirC = {0,0,-1,1};

        while(!q.isEmpty()) {
            int r = q.peek()[0];
            int c = q.peek()[1];
            q.poll();
            
            for(int i=0; i<=3; i++) {
                int newRow = r+dirR[i];
                int newCol = c+dirC[i];

                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m &&
                    visited[newRow][newCol]==0 && grid[newRow][newCol] == 1
                ) {
                    area++;
                    visited[newRow][newCol] = 1;
                    q.add(new int[]{newRow, newCol});
                }
            }
        }
        return area;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] visited = new int[rows][cols];
        int islands = 0;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == '1' && visited[i][j]==0) {
                    bfs(grid, i, j, visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    private void bfs(char[][]grid, int row, int col, int visited[][]) {
        Queue<int[]> q= new LinkedList<>();
        visited[row][col] = 1;
        int n = grid.length;
        int m=grid[0].length;
        q.add(new int[]{row, col});

        while(!q.isEmpty()) {
            int r=q.peek()[0];
            int c=q.peek()[1];
            q.poll();
            int[] dirRow = {-1,1,0,0};
            int[] dirCol = {0,0,-1,1};
            for(int k=0; k<=3;k++) {
                
                    int newRow = r+dirRow[k];
                    int newCol = c+dirCol[k];

                    if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && grid[newRow][newCol]=='1' && visited[newRow][newCol]==0
                    ) {
                        visited[newRow][newCol] = 1;
                        q.add(new int[]{newRow, newCol});
                    }
                
            }
        }
    }
}

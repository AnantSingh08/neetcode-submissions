class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int visited[][] = new int[n][m];
        Queue<int []> q = new LinkedList<>();
        int countFresh = 0;

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 2) {
                    visited[i][j] = 2;
                    q.add(new int[]{i,j,0});
                }
                else {
                    visited[i][j] = 0;
                }
                if(grid[i][j] == 1) {
                    countFresh++;
                }
            }
        }

        int tmax = 0;
        int count = 0;
        int[] dirRow = {-1,1,0,0};
        int[] dirCol = {0,0,-1,1};

        while(!q.isEmpty()) {
            int r = q.peek()[0];
            int c = q.peek()[1];
            int t = q.peek()[2];
            tmax = Math.max(t, tmax);
            q.poll();

            for(int k=0 ;k<4; k++) {
                int newRow = r + dirRow[k];
                int newCol = c + dirCol[k];

                if(newRow>=0 && newRow <n && newCol >=0 && newCol <m &&
                    visited[newRow][newCol] !=2 && grid[newRow][newCol] == 1) {
                        q.offer(new int[]{newRow, newCol, t+1});
                        visited[newRow][newCol] = 2;
                        count++;
                    }
            }
        }

        if(countFresh != count) return -1;
        return tmax;
    }
}

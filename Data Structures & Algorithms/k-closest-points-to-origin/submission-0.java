class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> minHeap =new PriorityQueue<>((a,b) -> a[2]-b[2]);

        int[][] res = new int[k][2];
        for(int i=0; i<points.length; i++) {
            int[] coord = points[i];
            int delX = coord[0];
            int delY = coord[1];

            int dist = delX*delX + delY*delY;

            minHeap.offer(new int[]{delX, delY, dist});
        }

        for(int i=0;i<k;i++) {
            int[] val = minHeap.poll();
            res[i] = new int[]{val[0],val[1]};
        }
        return res;
     }
}

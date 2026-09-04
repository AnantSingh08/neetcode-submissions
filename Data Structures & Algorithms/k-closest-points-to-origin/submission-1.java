class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[2],a[2]));

        int[][] res = new int[k][2];
        for (int i = 0; i < points.length; i++) {
            int[] coord = points[i];
            int delX = coord[0];
            int delY = coord[1];

            int dist = delX * delX + delY * delY;

            maxHeap.offer(new int[] {delX, delY, dist});
            while(maxHeap.size()>k) {
                maxHeap.poll();
            }
        }

        while(k-->0) {
            int[] val = maxHeap.poll();
            res[k] = new int[] {val[0], val[1]};
        }
        return res;
    }
}

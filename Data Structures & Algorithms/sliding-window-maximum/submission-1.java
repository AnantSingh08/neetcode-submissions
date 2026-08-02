class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];

        Deque<Integer> q = new ArrayDeque<>();

        for(int r=0; r<n; r++) {

            // remove elements that are not in window
            while(!q.isEmpty() && q.peekFirst()<= r-k) {
                q.pollFirst();
            } 

            // remove elements lesser than at r index from the back of the queue
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[r]) {
                q.pollLast();
            }

            // Add current index
            q.offerLast(r);

            // Record max once we have a full window
            if(r>=k-1) {
                res[r-k+1] = nums[q.peekFirst()];
            }
        }
        return res;
    }
}

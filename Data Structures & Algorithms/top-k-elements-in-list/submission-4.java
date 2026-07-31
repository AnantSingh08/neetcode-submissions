class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry: freqMap.entrySet()) {
            minHeap.offer(entry);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
    
        while (k-- > 0) {
            res[k] = minHeap.poll().getKey();
        }

        return res;
    }
}

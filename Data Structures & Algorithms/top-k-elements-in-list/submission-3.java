class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List <Integer>[] bucket = new List[nums.length+1];

        // Initialising bucket with empty arrays
        for(int i=0; i<bucket.length;i++) {
            bucket[i] = new ArrayList();
        }

        // Bucket is ready
        for(int i: freqMap.keySet()) {
            bucket[freqMap.get(i)].add(i);
        }

        List<Integer> temp = new ArrayList<>();
        for(int i = bucket.length-1; i>=0 ; i--) {
            List<Integer> list = bucket[i];
            for(int j: list) {
                temp.add(j);
            }
        }

        int[] res = new int[k];
        while(k-->0) {
            res[k]=temp.get(k);
        }
        return res;
        
    }
}

class KthLargest {
    List<Integer> arr;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.arr = new ArrayList<>();

        for(int num: nums) {
            arr.add(num);
        }
    }
    
    public int add(int val) {
        arr.add(val);
        Collections.sort(arr);
        return arr.get(arr.size()-k);
    }
}

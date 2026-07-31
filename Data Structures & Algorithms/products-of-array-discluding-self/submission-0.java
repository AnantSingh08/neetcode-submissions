class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prod = new int[n];

        for(int i=0;i<n;i++) {
            int p=1;
            for(int j=0;j<i;j++) {
                p*=nums[j];
            }
            for(int j=i+1;j<n;j++) {
                p*=nums[j];
            }
            prod[i]=p;
        }
        return prod;
    }
}  

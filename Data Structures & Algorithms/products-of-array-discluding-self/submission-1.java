class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int zeroCount=0;
        int[] res = new int[n];
        for(int num:nums) {
            if(num==0)zeroCount++;
        }
        int prod = 1;
        if(zeroCount>1) return new int[n];
        else if(zeroCount ==1) {
            int zindex = 0;
            for(int i=0;i<n;i++) {
                if(nums[i]==0) {
                    zindex=i;
                    continue;
                }
                prod*=nums[i];
            }
            res[zindex]=prod;
        }else{
            for(int num:nums) {
                prod*=num;
            }
            for(int i=0;i<nums.length;i++){
                res[i]=prod/nums[i];
            }
        }
        return res;
    }
}  

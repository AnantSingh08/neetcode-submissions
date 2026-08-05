class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=i+1;j<n;j++) {
                count++;
                if(temperatures[j]>temperatures[i]) {
                    res[i] = count;
                    break;
                } else {
                    res[i] = 0;
                }
            }
        }

        return res;
    }
}

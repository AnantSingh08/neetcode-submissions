class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqArr = new int[26];
        int maxF = 0, res = 0, l=0;

        for(int r=0; r<s.length();r++) {
            freqArr[s.charAt(r)-'A']++;
            maxF = Math.max(maxF, freqArr[s.charAt(r)-'A']);
            while(r-l+1 - maxF > k) {
            freqArr[s.charAt(l)-'A']--;
            l++;
        }

        res = Math.max(res, (r-l+1));
        }

       return res; 
    }
    
}

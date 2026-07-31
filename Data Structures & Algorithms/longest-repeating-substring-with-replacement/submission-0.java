class Solution {
    public int characterReplacement(String s, int k) {
        int[] hashSet = new int[26];
        int l=0, r=0, maxLen=0, maxFreq=0;

        for(r=0;r<s.length();r++) {
            hashSet[s.charAt(r)-'A']++;
            maxFreq = Math.max(maxFreq, hashSet[s.charAt(r)-'A']);

            while((r-l+1)-maxFreq >k) {
                hashSet[s.charAt(l)-'A']--;
                maxFreq = 0;
                for(int i=0;i<hashSet.length;i++) {
                    maxFreq = Math.max(maxFreq, hashSet[i]);
                }
                l++;
            }

            if((r-l+1)-maxFreq<=k) {
                maxLen = Math.max(maxLen, r-l+1);
            }
        }
        return maxLen;
    }
}

class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";

        int[] needFreq = new int[128];

        for(char c: t.toCharArray()) {
            needFreq[c]++;
        }

        int[] window = new int[128];
        int neededCount = t.length();
        int formedCount = 0;

        int l=0;
        int start = -1;
        int minLen = Integer.MAX_VALUE;

        for(int r=0 ;r<s.length(); r++) {

            char c = s.charAt(r);
            window[c]++;

            if(needFreq[c]>0 && window[c]<=needFreq[c]) {
                formedCount++;
            }

            while(formedCount == neededCount) {
                if(r-l+1<minLen) {
                start = l;
                minLen = r-l+1;
                }

                // Shrink window
                char left = s.charAt(l);
                window[left]--;

                if(needFreq[left]>0 && window[left]<needFreq[left]) {
                    formedCount --;
                }

                l++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "":s.substring(start,start+minLen);

    }
}

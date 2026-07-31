class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";

        String ans = "";
        int minLen = Integer.MAX_VALUE;

        for(int i=0; i<s.length(); i++) {
            for(int j=i; j< s.length(); j++) {

                String sub = s.substring(i,j+1);

                if(isValid(sub,t)) {
                    if(sub.length()<minLen) {
                        minLen = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }

    private boolean isValid(String sub, String t) {
        int[] freq = new int[256];

        for(char c: sub.toCharArray()) {
            freq[c]++;
        } 

        for(char c: t.toCharArray()) {
            if(freq[c]==0) return false;

            freq[c]--;
        }

        return true;
    }

}
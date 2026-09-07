class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int maxLen = 0;
        if(s.length()==1) return s;
        for(int i=0; i<s.length(); i++) {
            String subStr = "";
            for(int j=i; j<s.length(); j++) {
                subStr = s.substring(i,j+1);
                if(isPalindrome(subStr)) {
                    maxLen = Math.max(maxLen, subStr.length());
                    if(res.length()<maxLen) {
                        res = subStr;
                    }
                }
            }
        }
        return res;
    }

    boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l<r) {
            if(s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

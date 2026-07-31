class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] harr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            harr[s.charAt(i)-'a']++;
            harr[t.charAt(i)-'a']--;
        }

        for(int n: harr) {
            if(n!=0) return false;
        }
        return true;
    }
}

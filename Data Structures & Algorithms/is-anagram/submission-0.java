class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hMap = new HashMap<>();
        
        for (int i=0; i<s.length();i++) {
            Character si = s.charAt(i);
            Character ti = t.charAt(i);
            hMap.put(si, hMap.getOrDefault(si,0)+1);
            hMap.put(ti, hMap.getOrDefault(ti,0)-1);
        }

        for(int i: hMap.values()) {
            if(i!=0) return false;
        }
        return true;
    }
}

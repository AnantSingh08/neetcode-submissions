class Solution {
    public String minWindow(String s, String t) {
        // t inside s
        int tl = t.length();
        int sl = s.length();

        if (tl > sl) {
            return "";
        }
        Map<Character, Integer> target = new HashMap<>();

        for (int i = 0; i < tl; i++) {
            target.put(t.charAt(i), target.getOrDefault(t.charAt(i), 0) + 1);
        }
        int minLen = Integer.MAX_VALUE;
        String res = "";

        for (int i = 0; i < sl; i++) {
            Map<Character, Integer> temp = new HashMap<>();

            for (int j = i; j < sl; j++) {
                char ch = s.charAt(j);
                temp.put(ch, temp.getOrDefault(ch, 0) + 1);
                boolean isTrue = true;

                for (char c : target.keySet()) {
                    if (temp.getOrDefault(c, 0) < target.get(c)) {
                        isTrue = false;
                        break;
                    }
                }
                
                if (isTrue) {
                    int len = j-i+1;
                    if(len<minLen) {
                        minLen = len;
                        res = s.substring(i,j+1);
                    }
                    break;
                }
            }
        }
        return res;
    }
}

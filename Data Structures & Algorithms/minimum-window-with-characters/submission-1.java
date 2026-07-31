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
        int l = 0;
        int need = target.size();
        int have = 0;
        int startIdx = -1;
        Map<Character, Integer> temp = new HashMap<>();

        for (int r = 0; r < sl; r++) {
            char ch = s.charAt(r);
            temp.put(ch, temp.getOrDefault(ch, 0) + 1);

            if (target.containsKey(ch) && (temp.get(ch).intValue() == target.get(ch).intValue())) {
                have++;
            }

            while (have == need) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);

                temp.put(leftChar, temp.getOrDefault(leftChar, 0) - 1);

                if (target.containsKey(leftChar) && temp.get(leftChar) < target.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "":s.substring(startIdx,startIdx+minLen);
    }
}

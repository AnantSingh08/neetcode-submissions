class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(String s: strs) {
            char[] sarr= s.toCharArray();
            Arrays.sort(sarr);
            String sorted = Arrays.toString(sarr);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

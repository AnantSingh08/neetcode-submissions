class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        List<Integer> list = new ArrayList<>();

        for(int num: stones) {
            list.add(num);
        }

        while(list.size()>=2) {
            if(list.get(list.size()-1)==list.get(list.size()-2)) {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
            }else{
                int last = list.get(list.size()-1) - list.get(list.size()-2);
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                list.add(last);
            }
            Collections.sort(list);
        }
        return list.size()>0?list.get(0):0;
    }
}

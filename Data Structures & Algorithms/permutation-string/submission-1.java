class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        char[] ss1 = s1.toCharArray();
        Arrays.sort(ss1);
        
        for(int i=0;i<=s2.length()-s1.length();i++) {
            char[] temp = new char[s1.length()];
            for(int j=0;j<s1.length();j++) {
                temp[j] = s2.charAt(j+i);
            }
            Arrays.sort(temp);
            if(Arrays.equals(temp,ss1)){
                return true;
            }
        }

        return false;
    }
}

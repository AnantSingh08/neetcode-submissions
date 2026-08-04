class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String s: tokens) {
            if(
                !s.equals("+")&&
                !s.equals("-")&&
                !s.equals("*")&&
                !s.equals("/")
            ) {
                int n = Integer.parseInt(s);
                st.push(n);
            } else {
                int b = st.pop();
                int a = st.pop();

                if(s.equals("+")) {
                    st.push(a+b);
                }
                else if(s.equals("-")) {
                    st.push(a-b);
                }
                else if(s.equals("*")) {
                    st.push(a*b);
                }
                else if(s.equals("/")) {
                    st.push(a/b);
                }
            }
        }
        return st.peek();
    }
}

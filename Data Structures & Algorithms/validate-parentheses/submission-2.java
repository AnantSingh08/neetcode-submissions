class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(isOpen(c)) stack.push(c);
            else {
                if(stack.size() == 0) { return false;}
                else {
                    if(isBracketMatching(stack.peek(),c)) {
                    stack.pop();
                }else {
                    return false;
                }
                } 
            }
        }
        return stack.size()==0;
    }

    private boolean isOpen(char c) {
        switch(c) {
            case '{':
            case '(':
            case '[':
                return true;
            default:
                return false;
        }
    }
    private boolean isBracketMatching(char c, char s) {
        if (c=='('&&s==')') return true;
        else if (c=='['&&s==']') return true;
        else if (c=='{'&&s=='}') return true;
        else return false;
    }
}

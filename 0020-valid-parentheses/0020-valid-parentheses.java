class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.addLast(c);
                continue;
            }
            else if (stack.isEmpty()) return false;
            
            char peek = stack.peekLast();
            if (c == ')' && peek != '(') return false;
            else if (c == ']' && peek != '[') return false;
            else if (c == '}' && peek != '{') return false;
            else stack.removeLast();
            
        }
        
        return stack.isEmpty();
    }
}
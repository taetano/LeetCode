class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.addLast(')');
            else if (c == '[') stack.addLast(']');
            else if (c == '{') stack.addLast('}');
            else if (stack.isEmpty() || stack.removeLast() != c) return false;
        }
        
        return stack.isEmpty();
    }
}
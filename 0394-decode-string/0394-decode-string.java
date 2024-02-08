class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStk = new Stack<>();   
        Stack<String> strStk = new Stack<>();   
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        while (idx < s.length()) {
            char c = s.charAt(idx);
            
            if (Character.isDigit(c)) {
                int num = c - '0';
                while (idx + 1 < s.length() 
                       && Character.isDigit(s.charAt(idx + 1))) {
                    num = num * 10 + s.charAt(idx + 1) - '0';
                    idx++;
                }
                numStk.push(num);
            } else if (c == '[') {
                strStk.push(sb.toString());
                sb = new StringBuilder();
            } else if (c == ']') {
                int k = numStk.pop();
                StringBuilder tmp = new StringBuilder(strStk.pop());
                for (int i = 0; i < k; i++) {
                    tmp.append(sb);
                }
                sb = tmp;
            } else {
                sb.append(c);
            }
            idx++;
        }
        
        return sb.toString();
    }
}
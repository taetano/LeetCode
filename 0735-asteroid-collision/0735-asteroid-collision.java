class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();
        for (int asteroid : asteroids) {
            if (asteroid > 0) st.push(asteroid);
            else {
                while (!st.isEmpty() 
                       && st.peek() > 0 
                       && st.peek() < Math.abs(asteroid)) {
                    st.pop();
                }
                
                if (st.isEmpty() || st.peek() < 0) st.push(asteroid);
                else if (st.peek() + asteroid == 0) st.pop();
            }
        }
        
        int[] ans = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        
        return ans;
    }
}
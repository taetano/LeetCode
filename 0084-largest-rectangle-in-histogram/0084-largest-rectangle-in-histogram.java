class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(0);
        for (int i = 1; i <= heights.length; i++) {
            int cur = (i == heights.length) ? -1 : heights[i];
            while (!stk.isEmpty() && cur <= heights[stk.peek()]) {
                int height = heights[stk.pop()];
                int width = stk.isEmpty() ? i : i - stk.peek() - 1;
                int curArea = height * width;
                maxArea = Math.max(maxArea, curArea);
            }
            stk.push(i);
        }
        return maxArea;
    }
}
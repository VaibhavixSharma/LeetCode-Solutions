class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                left.add(-1);
            } else {
                left.add(stack.peek());
            }

            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                right.add(n);
            } else {
                right.add(stack.peek());
            }

            stack.push(i);
        }

        Collections.reverse(right);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = right.get(i) - left.get(i) - 1;
            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
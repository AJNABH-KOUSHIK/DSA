public class MaxRectangle {
    public static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;

        for (char[] row : matrix) {
            for (int i = 0; i < row.length; i++)
                heights[i] = row[i] == '1' ? heights[i] + 1 : 0;
            maxArea = Math.max(maxArea, largestHistogram(heights));
        }

        return maxArea;
    }

    private static int largestHistogram(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - 1 - stack.peek();
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }

        return max;
    }
}

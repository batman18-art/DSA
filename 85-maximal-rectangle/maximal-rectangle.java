class Solution {
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int[] heights = new int[cols + 1]; // heights[cols] stays 0 as a sentinel
        int[] stack = new int[cols + 1];
        int max = 0;

        for (char[] row : matrix) {
            // Build the histogram for this row
            for (int j = 0; j < cols; j++) {
                heights[j] = row[j] == '1' ? heights[j] + 1 : 0;
            }

            // Largest rectangle in histogram using a monotonic stack
            int top = 0;
            for (int i = 0; i <= cols; i++) {
                while (top > 0 && heights[stack[top - 1]] >= heights[i]) {
                    int h = heights[stack[--top]];
                    int width = (top == 0) ? i : i - stack[top - 1] - 1;
                    max = Math.max(max, h * width);
                }
                stack[top++] = i;
            }
        }
        return max;
    }
}
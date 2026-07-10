class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int vol;
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = heights.length - 1; j > 0; j--) {
                vol = Integer.min(heights[i], heights[j]) * (j - i);
                if (vol > max) {
                    max = vol;
                }
            }
        }
        return max;
    }
}

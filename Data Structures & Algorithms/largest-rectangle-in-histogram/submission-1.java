class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        int[] l = new int[heights.length];
        int[] r = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i--) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                r[i] = heights.length;

            } else {
                r[i] =st.peek();
                
            }
            st.push(i);

        }
        st.clear();
        for (int i = 0; i < heights.length; i++) {
            while (st.size() > 0 && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                l[i] = -1;

            } else {
                l[i] = st.peek();
                
            }
            st.push(i);
        }
        for (int i = 0; i < heights.length; i++) {
            int area = heights[i] * (r[i] - l[i] - 1);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }
}

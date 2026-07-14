class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") ) {
                int n1 = st.peek();
                st.pop();
                int n2 = st.peek();
                st.pop();
                st.push(n2+n1);
            }
             if (s.equals("+") ) {
                int n1 = st.peek();
                st.pop();
                int n2 = st.peek();
                st.pop();
                st.push(n2+n1);
            } else {
                int n = Integer.parseInt(s);
                st.push(n);
            }
        }
        return num;
    }
}

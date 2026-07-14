class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char ch : arr) {
            if (ch == '(' || ch == '{' || ch == '[' ) {
                st.push(ch);
            } else if (ch == ')') {
                if (!st.isEmpty()&&st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (ch == '}') {
                if (!st.isEmpty()&&st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                if (!st.isEmpty()&&st.peek() == '[') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

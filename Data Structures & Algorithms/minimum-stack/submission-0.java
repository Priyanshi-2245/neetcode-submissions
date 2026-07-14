class MinStack {
    Stack<Integer> st;
    Stack<Integer> st2;

    public MinStack() {
        st = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int val) {
        
        
        if (st.isEmpty()) {
            
            st.push(val);
            st2.push(val);
        }
        else {
            st.push(val);
            if (val < st2.peek()) {
            
                st2.push(val);
            } else {
                st2.push(st2.peek());
            }
        }
    }

    public void pop() {
        st.pop();
        st2.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return st2.peek();
    }
}

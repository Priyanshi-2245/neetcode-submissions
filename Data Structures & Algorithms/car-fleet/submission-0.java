class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[] t = new int[position.length];

        for (int i = 0; i < t.length; i++) {
            t[i] = (target - position[i]) / speed[i];
        }
        Arrays.sort(t);
        Stack<Integer> st=new Stack<>();
        int fleet=0;
        for(int i=0;i<t.length;i++){
            if(!st.isEmpty() && ( st.peek()==t[i] || st.peek()>t[i]) ){
                continue;
            }
            // else if(!st.isEmpty() && stack.peek()<t[i]){
            //     fleet++;
            //     st.push(t[i]);
            // }
            else{
                st.push(t[i]);
                fleet++;
            }

        }
        return fleet;
    }
}

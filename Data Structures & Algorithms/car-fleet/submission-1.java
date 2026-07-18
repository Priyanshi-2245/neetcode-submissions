class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        double[] t = new double[position.length];
        int[][] cars = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < t.length; i++) {
            t[i] = (target - cars[i][0]) / cars[i][1];
        }

        Stack<Double> st = new Stack<>();
        int fleet = 0;
        for (int i = t.length - 1; i >= 0; i--)  {
            if (!st.isEmpty() && (st.peek() == t[i] || st.peek() > t[i])) {
                continue;
            }

            else {
                st.push(t[i]);
                fleet++;
            }
        }
        return fleet;
    }
}

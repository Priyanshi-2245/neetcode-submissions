class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length-1;

        int[] ret = new int[2];
        while (p1 < p2) {
            int sum = numbers[p1] + numbers[p2];
            if (sum == target) {
                ret[0] = p1+1;
                ret[1] = p2+1;
                return ret;
            }
            if (sum < target) {
                p1++;
            }
            if (sum > target) {
                p2--;
            }
        }
       return new int[2]; 
    }
}

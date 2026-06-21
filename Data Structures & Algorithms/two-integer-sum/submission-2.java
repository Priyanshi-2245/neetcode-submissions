class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int needed=target-nums[i];
            if(map.containsKey(needed)&& map.get(needed)!=i){
                int[] arr=new int[2];
                arr[0]=i;
                arr[1]=map.get(needed);
                
                return arr;
            }
        }
        return new int[0];
    }
}

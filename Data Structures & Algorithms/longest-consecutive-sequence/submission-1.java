class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hash=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            hash.add(nums[i]);
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int dig:hash){
            if(!hash.contains(dig-1)){
                arr.add(dig);
            }
        }
        
        for(int i=0;i<arr.size();i++){
            int count=1;
            int num=arr.get(i);
            while(hash.contains(num+1)){
                count++;
                num++;
            }
            arr.set(i,count);
        }
        int max=arr.get(0);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        return max;
    }
}

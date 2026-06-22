class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map= new HashMap<>(); 
       for(int n:nums){
        map.put(n,map.getOrDefault(n,0)+1);
       }
       List<Integer> arr=new ArrayList<>(map.keySet());
       arr.sort((a,b)->map.get(b)-map.get(a));
       int[] top=new int[k];
       for(int i=0;i<k;i++){
           top[i]=arr.get(i);
       }
       return top;
    }
}

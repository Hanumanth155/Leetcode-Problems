class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int count=0;
        int sum=0;
        for(int x : nums){
            sum+=x;
            if(h.containsKey(sum-k)){
                count+=h.get(sum-k);
            }
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int count=0;
        for(int i : h.values()){
            count+=i*(i-1)/2;
        }
        return count;
    }
}
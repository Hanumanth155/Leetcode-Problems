class Solution {
    public int findLHS(int[] nums) {
        int max = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            int count=0;
            if(h.containsKey(i+1)){
               count = h.get(i)+h.get(i+1);
            }else if(h.containsKey(i-1)){
                count=h.get(i)+h.get(i-1);
            }
            max = Math.max(count,max);           
        }
        return max;
    }
}
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for(int i : nums){
            if(h.get(i)==1){
                res = i;
            }
        }
        return res;
    }
}
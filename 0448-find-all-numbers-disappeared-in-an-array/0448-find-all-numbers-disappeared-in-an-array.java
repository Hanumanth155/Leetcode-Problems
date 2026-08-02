class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
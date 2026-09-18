class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> h = new HashSet<>();
        for(int i: nums){
            h.add(i);
        }
        while(h.contains(original)){
            original*=2;           
        }
        return original;
    }
}
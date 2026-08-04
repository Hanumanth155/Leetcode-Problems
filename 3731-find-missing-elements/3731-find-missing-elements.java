class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int x : nums){
            h.put(x,1);
        }
        for(int i=min;i<=max;i++){
            if(!h.containsKey(i)){
                a.add(i);
            }
        }
        return a;
    }
}
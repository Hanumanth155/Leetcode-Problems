class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add((index[i]),nums[i]);
        }
        int[] res = new int[a.size()];
        int x=0;
        for(int i : a){
            res[x++]=i;
        }
        return res;
    }
}
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i : nums1){
            a.add(i);
        }
        for(int i: nums2){
            if(a.contains(i)){
                res.add(i);
                a.remove(Integer.valueOf(i));
            }
        }
        int[] ans = new int[res.size()];
        int index=0;
        for(int i : res){
            ans[index++]=i;
        }
        return ans;
    }
}
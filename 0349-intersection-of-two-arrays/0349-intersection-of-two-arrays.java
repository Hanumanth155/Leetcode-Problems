class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i:nums1){
            s.add(i);
        }
        for(int i:nums2){
            if(s.contains(i)){
                res.add(i);
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
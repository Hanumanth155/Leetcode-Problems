class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i:nums2){
            s2.add(i);
        }
        for(int i:nums1){
            s1.add(i);
        }
        for(int i:s1){
            if(!s2.contains(i)){
                list1.add(i);
            }
        }
        for(int i:s2){
            if(!s1.contains(i)){
                list2.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}
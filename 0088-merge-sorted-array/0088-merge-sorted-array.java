class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        for(;m<nums1.length;m++){
            nums1[m]=nums2[i++];
        }
        Arrays.sort(nums1);
    }
}
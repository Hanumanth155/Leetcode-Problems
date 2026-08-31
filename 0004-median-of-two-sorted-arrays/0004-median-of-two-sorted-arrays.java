class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length+nums2.length];
        int idx = 0;
        for(int i : nums1){
            merged[idx++]=i;
        }
        for(int i : nums2){
            merged[idx++]=i;
        }
        Arrays.sort(merged);
        int i = 0;
        int j = merged.length-1;
        while(i<j){
            i++;
            j--;
        }
        if(i==j){
            return merged[i]*1.0;
        }else{
            double x = merged[i]+merged[j];
            return x/2;
        }
        
    }
}
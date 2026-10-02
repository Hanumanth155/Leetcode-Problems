class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int index=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
                index=i;
            }
        }
        for(int i : nums){
            if(i==largest){
                continue;
            }
            if(i*2>largest){
                return -1;
            }
        }
        return index;  
    }
}
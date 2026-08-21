class Solution {
    public int findMiddleIndex(int[] nums) {
                int psum = 0;
        for(int i : nums){
            psum+=i;
        }
        int left = 0;
        for(int i=0;i<nums.length;i++){
            int right = psum-left-nums[i];
            if(right==left){
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length-1;
        if(n==0){
            return true;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]>=(n-i)){
                n=i;
                if(i==0){
                    return true;
                }
            }
        }
        return false;
    }
}
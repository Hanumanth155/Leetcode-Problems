class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase = false;
        boolean decrease = false;
        boolean same = false;
        if(nums.length==1){
            return true;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                increase=true;
            }else if(nums[i-1]>nums[i]){
                decrease = true;
            }else{
                same = true;
            }
        }
        if(increase && decrease){
            return false;
        }
        return increase || decrease || same;
    }
}
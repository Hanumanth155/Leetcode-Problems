class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i : nums){
            if(i>max){
                secMax = max;
                max=i;
            }else if(i>secMax && max!=i){
                secMax=i;
            }
        }
        if(nums.length<3){
            return -1;
        }
        return secMax;
    }
}
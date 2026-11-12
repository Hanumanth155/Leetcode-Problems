class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int decrease = 1;
        int i=0;
        int n = nums.length-1;
        int imax = 1;
        int dmax=1;
        while(i<n){
            if(nums[i]==nums[i+1]){
                increase=1;
                decrease=1;
                i++;
                continue;
            }else if(i<n && nums[i]<nums[i+1]){
                decrease=1;
                increase++;
                i++;
            }else if(i<n && nums[i]>nums[i+1]){
                increase=1;
                decrease++;
                i++;
            }

            if(increase>imax){
                imax=increase;
            }
            if(decrease>dmax){
                dmax=decrease;
            }
        }
        return Math.max(imax,dmax);
    }
}
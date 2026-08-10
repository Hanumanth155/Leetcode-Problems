class Solution {
    public int absDifference(int[] nums, int k) {
        if(nums.length ==1){
            return 0;
        }
        Arrays.sort(nums);
        int maxSum = 0;
        int minSum=0;
        for(int i=0,j=nums.length-1;i<k;i++,j--){
            minSum+=nums[i];
            maxSum+=nums[j];
        }
        return maxSum-minSum;
    }
}
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length,currSum=0;
       int actualSum = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            currSum+=nums[i];
        }
        return (actualSum-currSum);
        
    }
}
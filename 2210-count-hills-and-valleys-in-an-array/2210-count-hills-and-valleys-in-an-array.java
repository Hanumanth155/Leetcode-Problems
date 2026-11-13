class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int temp=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if((temp<nums[i]&&nums[i]>nums[i+1])||(temp>nums[i]&&nums[i]<nums[i+1])){
                count++;
                
            }
            temp=nums[i];
            
        }
        return count;
    }
}
class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int[] res = new int[nums.length/2];
        int index=0;
        boolean temp=true;
        for(int i=0;i<=nums.length-2;i+=2){
            if(temp){
                res[index++]=Math.min(nums[i],nums[i+1]);
                temp=false;
            }else{
                res[index++]=Math.max(nums[i],nums[i+1]);
                temp=true;
            }
        }
        return minMaxGame(res);
    }
}
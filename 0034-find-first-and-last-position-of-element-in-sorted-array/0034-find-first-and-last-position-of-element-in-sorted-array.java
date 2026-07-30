class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if(nums.length==1){
            if(nums[0]==target){
            return new int[]{0,0};
            }else{
                return res;
            }
        }
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                res[0]=mid;
                j=mid-1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        i=0;j=nums.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(nums[mid]==target){
                res[1]=mid;
                i=mid+1;
            }else if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return res;
    }
}
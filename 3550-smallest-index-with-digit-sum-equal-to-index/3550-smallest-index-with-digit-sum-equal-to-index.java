class Solution {
    public int smallestIndex(int[] nums) {
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>9){
                int n = nums[i];
                int sum=0;
                while(n!=0){
                    int rem = n%10;
                    sum+=rem;
                    n/=10;
                }
                if(sum==i){
                    index=i;
                    break;
                }
            }else{
                if(nums[i]==i){
                    index=i;
                    break;
                }
            }
        }
        return index;
    }
}
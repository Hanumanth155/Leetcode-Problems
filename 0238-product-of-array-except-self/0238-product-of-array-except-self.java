class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            pre[i]=prod;
        }
        prod=1;
        for(int j=nums.length-1;j>=0;j--){
            prod*=nums[j];
            suf[j]=prod;
        }
        if(nums.length==2){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
            return nums;
        }
        // System.out.println(Arrays.toString(nums));
        // System.out.println(Arrays.toString(pre));
        // System.out.println(Arrays.toString(suf));
        nums[0]=suf[1];
        nums[nums.length-1]=pre[nums.length-2];
        for(int i=1;i<=nums.length-2;i++){
            nums[i]=pre[i-1]*suf[i+1];
        }
        return nums;
    }
}
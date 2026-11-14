class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min = Integer.MAX_VALUE;
        int n = nums.size();
        for(int i=l;i<=r;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=nums.get(j);
            }
            if(sum>0){
                min=Math.min(sum,min);
            }
            for(int x=i;x<n;x++){
                sum+=nums.get(x);
                sum-=nums.get(x-i);
                if(sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
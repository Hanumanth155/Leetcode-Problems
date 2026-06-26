class Solution {
    public int maximumCount(int[] nums) {
        int countN=0,countP=0;
        for(int num:nums){
            if(num<0){
                countN++;
            }else if(num>=1){
                countP++;
            }
        }
        int res= Math.max(countN,countP);
        return res;
    }
}
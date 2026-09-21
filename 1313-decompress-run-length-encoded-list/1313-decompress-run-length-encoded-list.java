class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i=i+2){
            size+=nums[i];
        }
        int[] res = new int[size];
        int index=0;
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            int val = nums[i+1];
            while(freq!=0){
                res[index++]=val;
                freq--;
            }
        }
        return res;
    }
}
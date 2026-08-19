class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int index=0;
        for(int i : nums){
            if(i!=val){
                nums[index++]=i;
                count++;
            }
        }
        return count;
    }
}
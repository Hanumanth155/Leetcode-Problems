class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> pos= new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        int j=0;
        for(int i=0;i<pos.size();i++){
            nums[j]=pos.get(i);
            j++;
            nums[j]=neg.get(i);
            j++;
        }
        return nums;
    }
}
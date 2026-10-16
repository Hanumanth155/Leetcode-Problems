class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int red = 0;
        int white = 0;
        int blue = 0;
        for(int i : nums){
            if(i==0){
                red++;
            }else if(i==1){
                white++;
            }else{
                blue++;
            }
        }
        int index=0;
        while(red!=0){
            nums[index++]=0;
            red--;
        }
        while(white!=0){
            nums[index++]=1;
            white--;
        }
        while(blue!=0){
            nums[index++]=2;
            blue--;
        }
    }
}
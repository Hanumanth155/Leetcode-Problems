class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k>=n){
            k=k%n;
        }
        reverseArray(nums,0,(n-1));
        reverseArray(nums,0,(k-1));
        reverseArray(nums,k,(n-1));     
    }
    public static void reverseArray(int[] nums,int i,int j){
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
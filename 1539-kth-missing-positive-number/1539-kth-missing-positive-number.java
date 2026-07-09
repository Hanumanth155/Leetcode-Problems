class Solution {
    public int findKthPositive(int[] arr, int k) {
        int size = arr.length-1;
        int n = arr[size];
        int[] nums = new int[k];
        // ArrayList<Integer> nums = new ArrayList<>();
        int j=0;
        int i=1;
        int x=0;        
        while(x<k){
            if(j<arr.length&&arr[j]==i){
                j++;
            }else{
                nums[x++]=i;  
            }
            i++;
        }
        
        return nums[nums.length-1];
    }
}
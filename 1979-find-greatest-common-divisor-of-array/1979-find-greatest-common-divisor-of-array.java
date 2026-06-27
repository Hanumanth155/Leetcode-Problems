class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1=nums[0];
        int n2=nums[nums.length-1];
        while(n1>0){
            if(n1<n2){
                int temp = n1;
                n1=n2;
                n2=temp;
            }
            n1=n1%n2;
        }
        return n2;
    }
}
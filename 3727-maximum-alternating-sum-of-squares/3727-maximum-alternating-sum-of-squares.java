class Solution {
    public long maxAlternatingSum(int[] nums) {
        long[] squares = new long[nums.length];
        int index=0;
        for(int i:nums){
            squares[index++]=i*i;
        }
        Arrays.sort(squares);
        int i=0;
        int j=squares.length-1;
        boolean pass = true;
        long sum=0;
        while(i<=j){
            if(pass){
                sum+=squares[j];
                pass=false;
                j--;
            }else{
                sum-=squares[i];
                pass=true;
                i++;
            }
        }
        return sum;
    }
}
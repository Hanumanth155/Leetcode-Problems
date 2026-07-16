class Solution {
    public int diagonalPrime(int[][] nums) {
        int i,j,prime=0;
        for(i=0;i<nums.length;i++){
            for(j=0;j<nums[i].length;j++){
                if(i==j || (i+j)==(nums.length-1)){
                if(nums[i][j]>prime && checkPrime(nums[i][j])){
                    prime=nums[i][j];
                }
                }
            }
        }
        return prime;
    }

            public boolean checkPrime(int n){
            int count=0,i=1;
            while(i*i<=n){
                if(n%i==0){
                    count++;
                    if(i!=(n/i)){
                        count++;
                    }
                }
                i++;
            }
            return count==2;
        }
}
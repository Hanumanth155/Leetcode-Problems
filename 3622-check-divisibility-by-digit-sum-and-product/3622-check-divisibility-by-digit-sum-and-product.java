class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int rem;
        int save=n;
        while(n!=0){
            rem = n%10;
            sum+=rem;
            prod*=rem;
            n/=10;
        }
        int res = sum+prod;
        if(save%res==0){
            return true;
        }
        return false;
    }
}
class Solution {
    public int smallestNumber(int n, int t) {
        int res=0;
        int prod=0;
        while(true){
            prod = prodOfDigit(n);
            if(prod%t==0){
                res=n;
                break;
            }
            n++;
        }
        return res;

    }
    public static int prodOfDigit(int n){
        int prod=1;
        while(n!=0){
            int rem = n%10;
            prod = prod*rem;
            n/=10;
        }
        return prod;
    }
}
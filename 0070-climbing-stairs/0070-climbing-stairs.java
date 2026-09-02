class Solution {
    public int climbStairs(int n) {
        int n1=1,n2=2;
       
        if(n<=2){
            return n;
        }
        int temp=0;
        while(n>2){
            temp = n1+n2;
            n1 = n2;
            n2 = temp;
            n--;
        }
        return temp;
    }
}
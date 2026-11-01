class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int week=1;
        if(n<=7){
            return n*(n+1)/2;
        }
        while(n>7){
            for(int i=0;i<7;i++){
                sum+=week+i;
            }
            n-=7;
            week++;
        }
        for(int i=0;i<n;i++){
            sum+=week+i;
        }
        return sum;
    }
}
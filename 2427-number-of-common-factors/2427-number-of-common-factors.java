class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        int gcd = findGCD(a,b);
        for(int i=1;i*i<=gcd;i++){
            if(gcd%i==0){
                count++;
                if(i!=(gcd/i)){
                    count++;
                }
            }
        }
        return count;
    }
    public static int findGCD(int a,int b){
        while(a>0){
            if(a<b){
                int temp=a;
                a=b;
                b=temp;
            }
            a=a%b;
        }
        return b;
    }
}
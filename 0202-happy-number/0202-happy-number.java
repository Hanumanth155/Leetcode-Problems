class Solution {
    public boolean isHappy(int n) {
        
        while(n!=1&&n!=4){
            n=isASN(n);
        }
        return n==1;
    }

    public static int expoenent(int base,int pow){
        int expo=1;
        while(pow>0){
            expo*=base;
            pow--;
        }
        return expo;
    }
    
    public static int isASN(int n){
        int base,pow,asn=0;
         pow=2;
        while(n>0){
            base=n%10;
            asn=asn+expoenent(base,pow);
            n/=10;
        }
        return asn;
    }
}
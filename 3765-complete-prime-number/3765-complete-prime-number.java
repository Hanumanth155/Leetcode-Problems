class Solution {
    public boolean completePrime(int num) {
        if(!isPrime(num)){
            return false;
        }
        String str = String.valueOf(num);
        for(int i=1;i<=str.length();i++){
            int pre = Integer.parseInt(str.substring(0,i));
            if(!isPrime(pre)){
                return false;
            }
        }
        for(int i=0;i<str.length();i++){
            int suf = Integer.parseInt(str.substring(i));
            if(!isPrime(suf)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(i!=(n/i)){
                    count++;
                }
            }
        }
        return count==2;
    }
}
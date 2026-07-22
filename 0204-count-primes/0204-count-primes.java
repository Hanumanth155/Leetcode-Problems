class Solution {
    public int countPrimes(int n) {
    int i;
    if(n<=1){
            return 0;
    }
    boolean[] isPrime = new boolean[n];
    for( i=2;i<n;i++){
        isPrime[i]=true;
    }
    for(i=2;i*i<n;i++){
        if(isPrime[i]){
            for(int j=i*i;j<n;j+=i){
                isPrime[j]=false;
            }
        }
    }
    int count=0;
    for(i=2;i<n;i++){
        if(isPrime[i]){
            count++;
        }
    }
    return count;
}
}
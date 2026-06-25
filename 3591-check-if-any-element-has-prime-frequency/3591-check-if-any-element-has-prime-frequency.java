class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(isPrime(freq)){
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n){
        int count=0;
        if(n==1||n==0){
            return false;
        }
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
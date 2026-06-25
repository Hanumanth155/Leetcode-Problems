class Solution {
    public int getLeastFrequentDigit(int n) {
        Map<Integer,Integer> map = new HashMap<>();
        while(n>0){
            int rem=n%10;
            map.put(rem,map.getOrDefault(rem,0)+1);
            n/=10;
        }
        int minFreq = Integer.MAX_VALUE;
        int ans = 10;
        for(int num : map.keySet()){
            int freq = map.get(num);
            if(freq<minFreq){
                minFreq=freq;
                ans=num;
            }else if(freq==minFreq&&num<ans){
                ans=num;
            }
        }
        return ans==10?-1:ans;
    }
}
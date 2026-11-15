class Solution {
    public int numOfSubarrays(int[] arr) {
        long n = arr.length;
        long total = n*(n+1)/2;
        long evenCount = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int psum=0;
        for(int i : arr){
            psum+=i;
            int rem = psum%2;
            if(rem<0){
                rem+=2;
            }
            evenCount+=h.getOrDefault(rem,0);
            h.put(rem,h.getOrDefault(rem,0)+1);
        }
        return (int)((total-evenCount)%1000000007);
    }
}
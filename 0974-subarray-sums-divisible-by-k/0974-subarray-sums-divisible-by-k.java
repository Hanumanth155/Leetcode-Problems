class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int count=0;
        int psum=0;
        h.put(0,1);
        for(int i : nums){
            psum+=i;
            int rem = psum%k;
            if(rem<0){
                rem+=k;
            }
            count+=h.getOrDefault(rem,0);
            h.put(rem,h.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int res=0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : map.keySet()){
            int digit = map.get(num);
            if(digit==k||digit%k==0){
                res=res+(num*digit);
            }
        }
        return res;
    }
}
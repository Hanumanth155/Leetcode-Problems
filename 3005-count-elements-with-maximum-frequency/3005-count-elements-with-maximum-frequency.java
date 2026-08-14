class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i:nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int max = Collections.max(h.values());
        if(max==1){
            return nums.length;
        }
        // System.out.println(max);
        int res=0;
        for(int i : h.values()){
            // System.out.print(i+" ");
            if(i==max){
                res+=max;
                // System.out.print(res+" ");
            }
        }
        return res;
    }
}
class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> h = new HashSet<>();
       for(int i : nums){
        h.add(i);
       }
       int longest = 0;
       for(int i : h){
            if(!h.contains(i-1)){
                int temp = i;
                int count=1;
            
            while(h.contains(i+1)){
                i++;
                count++;
            }
            longest = Math.max(longest,count);
            }
       }
       return longest;
    }
}
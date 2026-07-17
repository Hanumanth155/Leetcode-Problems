class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                return i;
            }else{
                map.put(i,0);
            }
        }
        return 0;
    }
}
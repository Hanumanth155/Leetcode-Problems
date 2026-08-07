class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
            map.put(num,1);
            }
        }
        int maxKey=0;
        int count=nums.length/2;
        for(int key : map.keySet()){
            if(map.get(key)>count){
                maxKey = key;
            }
        }
    return maxKey;
    }
}
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i : nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        int count = nums.length/3;
        for(int i : h.keySet()){
            if(h.get(i)>count){
                a.add(i);
            }
        }
        return a;
    }
}
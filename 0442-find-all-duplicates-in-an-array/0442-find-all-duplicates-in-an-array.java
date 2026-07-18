class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int x : nums){
            if(h.containsKey(x)){
                a.add(x);
            }else{
                h.put(x,h.getOrDefault(x,0)+1);

            }
        }
        return a; 
    }
}
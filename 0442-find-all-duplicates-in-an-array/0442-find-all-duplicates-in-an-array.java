class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int x : nums){
            if(h.containsKey(x)){
                a.add(x);
            }else{
                h.put(x,1);

            }
        }
        return a; 
    }
}
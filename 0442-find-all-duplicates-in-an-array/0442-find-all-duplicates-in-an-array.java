class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : nums){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        for( int i : h.keySet()){
            if(h.get(i)>1){
                a.add(i);
            }
        }
        return a;
    }
}
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int x : arr){
            h.put(x,h.getOrDefault(x,0)+1);
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i :h.values()){
            s.add(i);
        }
        return h.size()==s.size();
    }
}
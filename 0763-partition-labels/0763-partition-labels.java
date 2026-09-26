class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> l = new ArrayList<>();
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            h.put(ch,i);
        }
        int prev = -1;
        int max = 0;
        for(int i=0;i<s.length();i++){
            max = Math.max(max,h.get(s.charAt(i)));
            if(max==i){
                l.add(max-prev);
                prev=max;
            }
        }
        return l;
    }
}
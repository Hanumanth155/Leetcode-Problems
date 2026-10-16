class Solution {
    public String frequencySort(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> h = new HashMap<>();
        for(char c :chars){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        List<Character> list = new ArrayList<>(h.keySet());
        list.sort((a,b)->h.get(b)-h.get(a));
        StringBuilder sb = new StringBuilder();
        for(char ch : list){
            int num = h.get(ch);
            while(num!=0){
                sb.append(ch);
                num--;
            }
        }
        return sb.toString();
    }
}
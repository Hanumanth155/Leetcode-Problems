class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> h = new HashSet();
        char[] ch = s.toCharArray();
        for(char i : ch){
            h.add(i);
        }
        return h.size();
    }
}
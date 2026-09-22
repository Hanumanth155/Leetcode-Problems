class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int left=0;
        int len=0;
        for(int right=0;right<s.length();right++){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left));
                left++;
            }
            h.add(s.charAt(right));
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}
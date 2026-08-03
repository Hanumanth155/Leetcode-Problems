class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> s = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            s.add(ch);
        }
        if(s.size()==26){
            return true;
        }
        return false;
    }
}
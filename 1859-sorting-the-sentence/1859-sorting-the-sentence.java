class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for(String i : words){
            int index = i.charAt(i.length()-1)-'0';
            sorted[index-1]=i.substring(0,i.length()-1);
        }
        String res = String.join(" ",sorted);
        return res;
    }
}
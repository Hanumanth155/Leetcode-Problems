class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] ch = s.toCharArray();
        long psum=0;
        for(int i : shifts){
            psum+=i;
        }
        for(int i=0;i<ch.length;i++){
            long shift =psum%26;
            char c = (char)(ch[i]+shift);
            if(c>'z'){
                c =(char)(c-26);
            }
            ch[i]=c;
            psum-=shifts[i];
        }
        return new String(ch);
    }
}
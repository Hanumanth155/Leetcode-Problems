class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray() ){
            if(i>='a' && i<='z'){
                st.push(i);
            }else{
            st.pop();
            }
        }
        StringBuilder ans= new StringBuilder();
        for(char i : st){
            ans.append(i);
        }
        return ans.toString();
    }
}
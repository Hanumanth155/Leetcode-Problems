class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        for(char i : ch){
            if(!st.isEmpty()&&i==st.peek()){
                st.pop();
            }else{
                st.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char i : st){
            sb.append(i);
        }
        return sb.toString();
    }
}
class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(!st.isEmpty() &&((st.peek()=='A'&&i=='B')||(st.peek()=='C'&&i=='D'))){
                st.pop();
            }else{
                st.push(i);
            }
        }
        return st.size();
    }
}
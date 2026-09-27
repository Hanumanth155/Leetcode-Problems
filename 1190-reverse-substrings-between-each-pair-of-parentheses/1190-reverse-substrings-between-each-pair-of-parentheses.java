class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c!=')'){
                st.push(c);
            }else{
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='('){
                    sb.append(st.pop());
                }
                st.pop();
                for(char x :sb.toString().toCharArray()){
                    st.push(x);
                }
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
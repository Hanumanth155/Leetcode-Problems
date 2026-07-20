class Solution {
    public String removeStars(String s) {
        Stack<Character> st  = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        if(st.isEmpty()){
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(char c : st){
            res.append(c);
        }
        return res.toString();            
        }
}

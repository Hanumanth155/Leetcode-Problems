class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                count++;
            }else if(c==')'){
                count--;
            }
            if(count<0){
                count=0;
                continue;
            }
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=st.size()-1;i>=0;i--){
            char c = st.get(i);
            if(c=='('&&count>0){
                count--;
                continue;
            }
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
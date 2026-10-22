class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c!=']'){
                st.push(c);
            }else{
                StringBuilder sb = new StringBuilder();
                while(st.peek()!='['){
                    sb.insert(0,st.pop());
                }
                st.pop();
                int count = 0;
                int place = 1;
                while(!st.isEmpty()&&Character.isDigit(st.peek())){
                    count+=(st.pop()-'0')*place;
                    place*=10;
                }
                String copy = sb.toString();
                StringBuilder repeated = new StringBuilder();
                for(int i=0;i<count;i++){
                    repeated.append(copy);
                }
                for(char x :repeated.toString().toCharArray()){
                    st.push(x);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c : st){
            res.append(c);
        }
        return res.toString();
    }
}
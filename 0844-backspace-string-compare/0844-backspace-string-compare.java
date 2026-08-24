class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char i : s.toCharArray()){
            if(st1.isEmpty() && i=='#'){
                continue;
            }
            if( i=='#' ){
                st1.pop();
            }else{
                st1.push(i);
            }
        }
        for(char i : t.toCharArray()){
            if(st2.isEmpty()&&i=='#'){
                continue;
            }
            if(i=='#' ){
                st2.pop();
            }else{
                st2.push(i);
            }
        }
        if(st1.size()!=st2.size()){
            return false;
        }
        while(st1.size()>0){
            if(st1.peek()!=st2.peek()){
                return false;
            }
            st1.pop();
            st2.pop();
        }
        return true;
    }
}
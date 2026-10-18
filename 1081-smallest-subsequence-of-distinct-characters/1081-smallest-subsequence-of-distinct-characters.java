class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        for(int i=0;i<s.length();i++){
            h.put(s.charAt(i),i);
        }
        HashSet<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                while(!stack.isEmpty()&&ch<stack.peek()&&i<h.get(stack.peek())){
                    set.remove(stack.pop());
                }
                stack.push(ch);
                set.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char i : stack){
            sb.append(i);
        }
        return sb.toString();
    }
}
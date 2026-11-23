class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev=0;
        for(String i : words){
            if(Character.isDigit(i.charAt(0))){
                int num = Integer.parseInt(i);
                if(num<=prev){
                    return false;
                }
                prev=num;
            }
        }
        return true;
    }
}
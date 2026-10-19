class Solution {
    public int percentageLetter(String s, char letter) {
        double count=0;
        for(char i : s.toCharArray()){
            if(i==letter){
                count++;
            }
        }
        int size = s.length();
        return (int)((count/size)*100);
    }
}
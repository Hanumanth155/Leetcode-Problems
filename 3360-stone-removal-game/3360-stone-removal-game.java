class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int move=10;
        boolean alice=false;
        while(n>=move){
            n-=move;
            move--;
            if(alice){
                alice=false;
            }else{
                alice=true;
            }
        }
        if(alice){
            return true;
        }
        return false;
    }
}
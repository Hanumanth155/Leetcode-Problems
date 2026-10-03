class Solution {
    public boolean judgeSquareSum(int c) {
        int num1 = 0;
        int num2 = (int)Math.sqrt(c);
        while(num1<=num2){
            long res = (long)num1*num1+(long)num2*num2;
            if(res==c){
                return true;
            }else if(res<c){
                num1++;
            }else{
                num2--;
            }
        }
        return false;
    }
}
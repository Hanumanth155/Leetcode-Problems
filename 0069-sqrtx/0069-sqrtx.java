class Solution {
    public int mySqrt(int x) {
        long square;
        int i;
        for(i=1;i<=x;i++){
            square = (long) i*i;
            if(square==x){
                return i;
            }else if(square>x){
                return i-1;
            }
        }
        return 0;
    }
}
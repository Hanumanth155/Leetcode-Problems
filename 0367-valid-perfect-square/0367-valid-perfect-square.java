class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high=num;
        long mid;
        long square;
        while(low<=high){
            mid=(low+high)/2;
            square=mid*mid;
            if(square==num){
                return true;
            }else if(square<num){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}
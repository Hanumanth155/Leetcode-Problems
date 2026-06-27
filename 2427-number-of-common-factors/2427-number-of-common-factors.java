class Solution {
    public int commonFactors(int a, int b) {
        int higher = a,count=0;
        if(b>a){
            higher=b;
        }
        for(int i=1;i<=higher;i++){
            if(a%i==0&&b%i==0){
                count++;
            }
        }
        return count;
    }
}
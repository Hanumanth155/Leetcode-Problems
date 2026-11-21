class Solution {
    public int passThePillow(int n, int time) {
        boolean front=true;
        int res=1;
        while(time!=0){
            if(front){
                res++;
                if(res==n){
                    front=false;
                }
            }else{
                res--;
                if(res==1){
                    front=true;
                }
            }
            time--;
        }
        return res;
    }
}
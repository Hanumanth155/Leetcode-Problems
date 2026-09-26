class Solution {
    public int[] successfulPairs(int[] s, int[] p, long success) {
        int[] res = new int[s.length];
        Arrays.sort(p);
        for(int i=0;i<s.length;i++){
            int count=0;
            int j=0;
            int k=p.length-1;
            while(j<=k){
                int mid = (j+k)/2;
                if((long)s[i]*p[mid]<success){
                    j=mid+1;
                }else{
                    k=mid-1;
                    count=p.length-mid;
                }
            }
            res[i]=count;
        }
        return res;
    }
}
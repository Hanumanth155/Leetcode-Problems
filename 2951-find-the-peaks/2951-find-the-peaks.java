class Solution {
    public List<Integer> findPeaks(int[] m){
        List<Integer> l = new ArrayList<>();
         for(int i=1;i<m.length-1;i++){
            if(m[i-1]<m[i]&&m[i]>m[i+1]){
                l.add(i);
            }
         } 
        return l;
    }
}
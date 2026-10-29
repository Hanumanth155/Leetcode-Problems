class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long> h = new HashMap<>();
        long count=0;
        for(int[] x : rectangles){
            double a = x[0];
            double b = x[1];
            double division = a/b;
            if(h.containsKey(division)){
                count+=h.get(division);
            }
            h.put(division,h.getOrDefault(division,0L)+1);
        }
        return count;
    }
}
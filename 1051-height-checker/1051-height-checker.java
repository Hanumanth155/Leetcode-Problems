class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] temp = heights.clone();
        Arrays.sort(temp);
        for(int i=0;i<heights.length;i++){
            if(temp[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}
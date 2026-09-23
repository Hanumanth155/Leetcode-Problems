class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int total = 0;
        for(int num : cardPoints){
            total+=num;
        }
        int size = cardPoints.length-k;
        if(size==0){
            return total;
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=cardPoints[i];
        }
        int minSum = sum;
        for(int i=size;i<cardPoints.length;i++){
            sum+=cardPoints[i];
            sum-=cardPoints[i-size];
            minSum = Math.min(sum,minSum);
        }
        return total-minSum;
    }
}
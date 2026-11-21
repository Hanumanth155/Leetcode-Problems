class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles>=numExchange){
            int full = numBottles/numExchange;
            int rem = numBottles%numExchange;
            total+=full;    
            numBottles=full+rem;
        }
        return total;
    }
}
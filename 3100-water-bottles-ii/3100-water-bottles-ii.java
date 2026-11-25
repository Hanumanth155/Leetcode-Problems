class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            empty -= numExchange;
            empty++;
            numExchange++;
            total++; 
        }
        return total;
    }
}
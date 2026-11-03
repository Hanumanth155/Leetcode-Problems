class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int highest = nums[nums.length-1];
        int moves=0;
        for(int i=0;i<nums.length-1;i++){
            moves+=highest-nums[i];
        }
        return moves;
    }
}
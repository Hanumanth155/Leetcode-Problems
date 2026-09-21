class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2){
            int freq=nums[i];
            int val = nums[i+1];
            while(freq!=0){
                a.add(val);
                freq--;
            }
        }
        int[] res = new int[a.size()];
        int index=0;
        for(int num : a){
            res[index++]=num;
        }
        return res;
    }
}
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int num :nums){
            h.put(num,h.getOrDefault(num,0)+1);
        }
        int[] res = new int[2];
        int index=0;
        for(int i : h.keySet()){
            if(h.get(i)==2){
                res[index++]=i;
            }
        }
        return res;
    }
}
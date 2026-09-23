class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int count=0;
        for(int num :nums){
            h.put(num,h.getOrDefault(num,0)+1);
            if(h.get(num)==2){
                count++;
            }
        }
        int[] res = new int[count];
        int index=0;
        for(int i : h.keySet()){
            if(h.get(i)==2){
                res[index++]=i;
            }
        }
        return res;
    }
}
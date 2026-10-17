class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i: nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        list.sort((a,b)->{
            if(!h.get(b).equals(h.get(a))){
                return h.get(a)-h.get(b);
            }
            return b-a;
        });
        int index = 0;
        int[] res=new int[nums.length];
        for(int x : list){
            res[index++]=x;
        }
        return res;
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        int x = 1;
        for(int i : arr){
           if(!map.containsKey(i)){
                map.put(i,x++);
           }
        }
        int[] res = new int[arr.length];
        int index = 0;
        for(int i : temp){
            res[index++]=map.get(i);
        }
        return res;
    }
}
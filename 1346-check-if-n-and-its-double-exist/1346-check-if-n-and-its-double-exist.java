class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int count=0;
        for(int i : arr){
            int num = i*2;
            if(num==0){
                count++;
                continue;
            }
            h.put(num,1);
        }
        if(count>=2){
            return true;
        }
        for(int i : arr){
            if(h.containsKey(i)){
                return true;
            }
        }
        return false;
    }
}
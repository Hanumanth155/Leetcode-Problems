class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] arr = s.trim().split(" ");
        HashMap<Character,String> h = new HashMap<>();
        if(p.length!=arr.length){
            return false;
        }
        for(int i=0;i<p.length;i++){
            if(h.containsKey(p[i])){
                if(!arr[i].equals(h.get(p[i]))){
                    return false;
                }

            }else{
                if(h.containsValue(arr[i])){
                    return false;
                }
            h.put(p[i],arr[i]);
            }
        }
        return true;
    }
}
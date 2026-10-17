class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       int count =  map.get(s.charAt(0));
       for(int num : map.values()){
        if(num==count){
            continue;
        }else{
            return false;
        }
       }
       return true;
    }
}
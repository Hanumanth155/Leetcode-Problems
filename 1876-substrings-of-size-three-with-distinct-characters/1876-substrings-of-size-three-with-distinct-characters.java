class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        Map<Character,Integer> map = new HashMap<>();
        if(s.length()<3){
            return count;
        }
        for(int i=0;i<3;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==3){
            count++;
        }
        
        for(int k=3;k<s.length();k++){
            char left = s.charAt(k-3);
            map.put(left,map.get(left)-1);
            if(map.get(left)==0){
                map.remove(left);
            }
            char right=s.charAt(k);
            map.put(right,map.getOrDefault(right,0)+1);

            if(map.size()==3){
                count++;
            }
        }
        return count;

        
    }
}
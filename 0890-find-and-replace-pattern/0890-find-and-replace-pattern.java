class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> a = new ArrayList<>();
        char[] p = pattern.toCharArray();
        for(String x : words){
            HashMap<Character,Character> h = new HashMap<>();
            char[] w = x.toCharArray();
            boolean found=true;
            for(int i=0;i<p.length;i++){
                if(h.containsKey(p[i])){
                    if(h.get(p[i])!=w[i]){
                        found = false;
                        break;
                    }

                }else{
                    if(h.containsValue(w[i])){
                        found=false;
                        break;
                    }
                    h.put(p[i],w[i]);
                }
            }
            if(found){
                a.add(x);
            }
        }
        return a;
    }
}
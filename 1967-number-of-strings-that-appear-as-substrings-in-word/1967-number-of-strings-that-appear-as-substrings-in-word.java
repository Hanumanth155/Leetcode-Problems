class Solution {
    public int numOfStrings(String[] patterns, String word) {
        HashMap<String,Integer> h = new HashMap<>();

        for(int i=0;i<word.length();i++){
            for(int j=i+1;j<=word.length();j++){
                h.put(word.substring(i,j),1);
            }
        }
        int count=0;
        for(String x : patterns){
            if(h.containsKey(x)){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h = new HashMap<>();
        for(String i : strs){
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(h.containsKey(s)){
                h.get(s).add(i);
            }else{
                ArrayList<String> a = new ArrayList<>();
                a.add(i);
                h.put(s,a);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> i : h.values()){
            ans.add(i);
        }
        return ans;
    }
}
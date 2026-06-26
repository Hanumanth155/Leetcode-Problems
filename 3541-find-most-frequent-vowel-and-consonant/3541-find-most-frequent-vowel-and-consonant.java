class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int minVowels=0,minConsonant=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                int vowels=map.get(ch);
                minVowels = Math.max(minVowels,vowels);
            }else{
                int consonants=map.get(ch);
                minConsonant=Math.max(minConsonant,consonants);
            }
    }
    return minVowels+minConsonant;
}
}
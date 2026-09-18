class Solution {
    public String capitalizeTitle(String title) {
        String title1 = title.toLowerCase(); 
        String[] words = title1.split(" ");
        StringBuilder res = new StringBuilder();
        StringBuilder sb;
        for(int i=0;i<words.length;i++){
            if(words[i].length()<=2){
              sb = new StringBuilder(words[i].toLowerCase());
              
            }else{
              sb = new StringBuilder(words[i]);
              sb.setCharAt(0,(char)(sb.charAt(0)-32));; 
            }  
            res.append(sb);
            if(i!=words.length-1){
                res.append(" ");
            }     
        }
        return res.toString();
    }
}
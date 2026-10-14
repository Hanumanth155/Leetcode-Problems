class Solution {
    public int compress(char[] chars) {

        if(chars.length==1){
            return 1;
        }
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<chars.length){
            int count=0;
            char ch = chars[i];
            sb.append(ch);
            while(i<chars.length&&chars[i]==ch){
                count++;
                i++;
            }
            if(count!=1){
                sb.append(count);
            }                     
        }
        char[] res =sb.toString().toCharArray();
        for(char x=0;x<res.length;x++){
            chars[x]=res[x];
        }
        return sb.length();
    }
}
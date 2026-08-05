class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length()/2;
        int count=0;
        String str=s.toLowerCase();
        char[] c = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                if(i<length){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return count==0;
    }
}
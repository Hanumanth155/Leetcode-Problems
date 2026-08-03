class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] c = s.toCharArray();
        while(i<j){
            while(i<=s.length()-1){
                if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
                    break;
                }else if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
                    break;
                }
                i++;                
            }
            while(j>=0){
            if(c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U'){
                    break;
            }else if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'){
                    break;
            }
            j--;
            }
            if(i<j){
                char temp = c[i];
                c[i]=c[j];
                c[j]=temp;
            }
            i++;
            j--;
        }
        String res = new String(c);
        return res;
    }
}
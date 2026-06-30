class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        String s =String.valueOf(num);
        String res="";
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
             res = res+ch;
        }
        int n = Integer.parseInt(res);
        if(num%n==0){
            count++;
        }

        for(int i=k;i<s.length();i++){
            res = res.substring(1);
            res=res+s.charAt(i);
            n = Integer.parseInt(res);
            if(n!=0 && num%n==0){
                count++;
            }
        }
        return count;
    }
}
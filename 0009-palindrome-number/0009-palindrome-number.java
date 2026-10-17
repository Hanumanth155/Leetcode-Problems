class Solution {
    public boolean isPalindrome(int x) {
        boolean isPalindrome=false;
        String str=String.valueOf(x);
        int left=0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
               return isPalindrome;
            }
            left++;
            right--;
        }
        isPalindrome=true;
       return isPalindrome;

    }
}
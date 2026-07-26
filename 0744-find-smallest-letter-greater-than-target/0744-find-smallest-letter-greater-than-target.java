class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target=='z'){
            return letters[0];
        }
        int left=0;
        int right =  letters.length-1;
        while(left<right){
            int mid = (left+right)/2;
            if(letters[mid]<=target){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        if(letters[left]>target){
            return letters[left];
        }
        return letters[0];
    }
}
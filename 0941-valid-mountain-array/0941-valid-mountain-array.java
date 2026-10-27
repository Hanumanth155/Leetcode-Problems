class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int i=0;
        int n = arr.length-1;
        while(i<n&&arr[i]<arr[i+1]){
            i++;
        }
        if(i==0||i==n){
            return false;
        }
        while(i<n&&arr[i]>arr[i+1]){
            i++;
        }
        return i==n;
    }
}
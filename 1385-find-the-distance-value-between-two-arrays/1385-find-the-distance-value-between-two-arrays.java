class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            int left=0;
            int right=arr2.length-1;
            boolean found=false;
            while(left<=right){
                int mid = left+(right-left)/2;
                int diff= Math.abs(arr1[i]-arr2[mid]);
                if(diff<=d){
                    found=true;
                    break;
                }else if(arr2[mid]<arr1[i]){
                    left=mid+1;
                }else{
                    right=mid-1;
                }
            }
            if(!found) count++;       
        }
        return count;
    }
}
class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int avg = sum/k;
        if(avg>=t){
            count++;
        }
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            avg=sum/k;
            if(avg>=t){
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int[] nums,int l,int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);
        }
    }
    public static void merge(int[] nums,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int[] res=new int[nums.length];
        int k=0;
        while(i<=mid&&j<=r){
            if(nums[i]<nums[j]){
                res[k++]=nums[i];
                i++;
            }else{
                res[k++]=nums[j];
                j++;
            }
        }
        while(i<=mid){
            res[k++]=nums[i];
            i++;
        }
        while(j<=r){
            res[k++]=nums[j];
            j++;
        }
        i=l;
        k=0;
        while(i<=r){
            nums[i++]=res[k++];
        }
    }
}
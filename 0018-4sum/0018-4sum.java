class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        int i,j,k,l;
        i=0;
        while(i<nums.length){
            j=i+1;
            while(j<nums.length){
                k = j+1;
                l = nums.length-1;
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        ArrayList<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        a.add(nums[l]);
                        s.add(a);
                        k++;
                        l--;
                    }else if(sum<target){
                        k++;
                    }else{
                        l--;
                    }
                }
                j++;
            }
            i++;
        }
        return new ArrayList<>(s);
    }
}
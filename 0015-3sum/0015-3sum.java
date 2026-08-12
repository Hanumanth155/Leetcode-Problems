class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();
        int i,j,k;

        for(i=0;i<nums.length;i++){
            j=i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    s.add(a);
                    j++;
                    k--;
                }else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return new ArrayList<>(s);
    }
}
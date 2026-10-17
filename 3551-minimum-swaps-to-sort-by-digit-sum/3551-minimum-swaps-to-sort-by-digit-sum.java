class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = nums[i];
            int sum=0;
            while(num!=0){
                int rem = num%10;
                sum+=rem;
                num/=10;
            }
            map.put(nums[i],sum);
        }
        Integer[] sorted = new Integer[n];
        for(int i=0;i<n;i++){
            sorted[i]=nums[i];
        }
        Arrays.sort(sorted,(a,b)->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(a)-map.get(b);
            }
            return a-b;
        });
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<n;i++){
            map1.put(nums[i],i);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(sorted[i]!=nums[i]){
                int ind = map1.get(sorted[i]);
                int temp = nums[i];
                nums[i]=nums[ind];
                nums[ind]=temp;
                map1.put(nums[i],i);
                map1.put(nums[ind],ind);
                count++;
            }
        }
        return count;
    }
}
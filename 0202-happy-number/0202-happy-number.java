class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
        int sum;
        while(n!=1){
            sum=0;
        while(n!=0){
            int rem = n%10;
            sum = sum+ (rem*rem);
            n/=10;
        }
        if(s.contains(sum)){
            return false;
        }
        s.add(sum);
        n=sum;
        }
        return true;
    }
}
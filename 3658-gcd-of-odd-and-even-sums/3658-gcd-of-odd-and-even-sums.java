class Solution {
    public int gcdOfOddEvenSums(int n) {
        int n1 = evenSum(n);
        int n2 = oddSum(n);
        while(n1!=0){
            if(n1<n2){
                int temp=n1;
                n1=n2;
                n2=temp;
            }
            n1=n1%n2;
        }
        return n2;
        
    }
    public static int evenSum(int n){
        int sum=0;
        while(n>0){
            sum=sum+2;
            n--;
        }
        return sum;
    }
    public static int oddSum(int n){
        int sum=0;
        while(n>0){
            sum=sum+1;
            n--;
        }
        return sum;
    }
}
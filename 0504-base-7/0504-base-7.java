class Solution {
    public String convertToBase7(int num) {
        int temp=num;
        if(num==0){
            return "0";
        }
        if(num<0){
            num=-(num);
        }
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(temp<0){
            sb.append('-');
        }
        return sb.reverse().toString();
    }
}
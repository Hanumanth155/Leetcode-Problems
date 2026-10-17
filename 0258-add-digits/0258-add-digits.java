class Solution {
    public int addDigits(int num) {
 int rem, res, op;
        if (num == 0) {
            return 0;
        }
        while (num >= 10) {
            res=0;
            while (num > 0) {
                rem = num % 10;
                res += rem;
                num /= 10;
            }
            num = res; 
        }
        return num;
    }
}
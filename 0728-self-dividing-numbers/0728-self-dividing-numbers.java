class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num=i;
            boolean res=true;
            while(num>0){
                int rem = num %10;
                if(rem==0||i%rem!=0){
                    res = false;
                    break;
                }
                num/=10;
            }
            if(res==true){
                list.add(i);
            }
        }
        return list;
    }
}
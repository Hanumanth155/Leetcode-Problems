class Solution {
    int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    public int daysBetweenDates(String date1, String date2) {
        int d1 = totalDays(date1);
        int d2 = totalDays(date2);
        return Math.abs(d1-d2);
    }

    public int totalDays(String date){
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int total = 0;
        for(int i=1971;i<year;i++){
            boolean isLeap = (((i%4==0)&&(i%100!=0))||(i%400==0));
            total+=isLeap?366:365;
        }
        boolean leap = (((year%4==0)&&(year%100!=0)) || (year%400==0));
        if(leap){
           days[1]=29;
        }else{
            days[1]=28;
        }
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        total+=day;
        return total;
    }
}
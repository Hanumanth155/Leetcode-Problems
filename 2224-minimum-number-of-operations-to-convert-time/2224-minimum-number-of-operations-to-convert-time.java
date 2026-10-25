class Solution {
    int[] m = {60,15,5,1};
    public int convertTime(String current, String correct) {
        int time1 = totalMinutes(current);
        int time2 = totalMinutes(correct);
        int timeDiff = Math.abs(time1-time2);
        int count=0;
        for(int i=0;i<m.length;i++){
            while(timeDiff>=m[i]){
                timeDiff-=m[i];
                count++;
            }
        }
        return count;     
    }

    public int totalMinutes(String a){
        int hour = Integer.parseInt(a.substring(0,2));
        int minute = Integer.parseInt(a.substring(3,5));
        return (hour*60 +minute);
    }
}
class Solution {

    int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int start1 = convert(arriveAlice);
        int end1 = convert(leaveAlice);
        int start2 = convert(arriveBob);
        int end2 = convert(leaveBob);

        int start = Math.max(start1,start2);
        int end = Math.min(end1,end2);

        return Math.max(0,end-start+1);
    }

    public int convert(String s){
        int month = Integer.parseInt(s.substring(0,2));
        int day = Integer.parseInt(s.substring(3,5));
        int total = day;
        for(int i=0;i<month-1;i++){
            total+=days[i];
        }
        return total;
    }
}
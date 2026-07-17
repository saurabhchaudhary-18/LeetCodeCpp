class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");
        int cnt = 0;
        cnt = cnt+(Integer.parseInt(end[0])-Integer.parseInt(start[0]))*60*60;
        cnt = cnt + (Integer.parseInt(end[1])-Integer.parseInt(start[1]))*60;
        cnt = cnt + (Integer.parseInt(end[2])-Integer.parseInt(start[2]));
        return cnt;
    }
}
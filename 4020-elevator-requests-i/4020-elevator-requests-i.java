class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time = requests[0];
        for(int i=1; i<requests.length; i++){
            time = time + diff(requests[i],requests[i-1]);
        }
        return time;
    }
    private static int diff(int a, int b){
        if(a>b){
            return a-b;
        } else {
            return b-a;
        }
    }
}
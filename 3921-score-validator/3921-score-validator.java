class Solution {
    public int[] scoreValidator(String[] events) {
        int[] arr = new int[2];
        for(int i=0; i<events.length; i++){
            if(arr[1]==10){
                break;
            }
            if(events[i].equals("W")){
                arr[1]++;
            } else if(events[i].equals("WD") || events[i].equals("NB")){
                arr[0]++;
            } else {
                arr[0] = arr[0] + Integer.parseInt(events[i]);
            }
        }
        return arr;
    }
}
class Solution {
    public String[] assignUmbrella(int[] rain) {
        boolean alice = false;
        boolean bob = false;
        int al = 0;
        int bo = 0;
        String[] arr = new String[rain.length];
        for(int i=0; i<=rain.length-1; i++){
            alice = false;
            bob = false;
            if(i==rain.length-1){
                if(rain[i]==1){
                    bob = true;
                    arr[i] = "Bob";
                    bo++;
                } else {
                    arr[i] = "None";
                }
                break;
            }
            if(rain[i] == rain[i+1] && rain[i]==1 && rain[i+1]==1){
                alice = true;
            }
            if(rain[i]==1){
                bob = true;
            }
            if(alice==true && bob==false){
                arr[i] = "Alice";
                al++;
            } else if(alice==false && bob==true){
                arr[i] = "Bob";
                bo++;
            } else if(alice == false && bob == false){
                arr[i] = "None";
            } else {
                if(al<bo){
                    arr[i] = "Alice";
                    al++;
                } else if(bo<al){
                    arr[i] = "Bob";
                    bo++;
                } else {
                    arr[i] = "Alice";
                    al++;
                }
            }
        }
        return arr;
    }
}
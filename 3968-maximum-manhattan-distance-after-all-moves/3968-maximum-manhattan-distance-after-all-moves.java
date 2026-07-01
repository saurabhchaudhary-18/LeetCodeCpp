class Solution {
    public int maxDistance(String moves) {
        int rl = 0;
        int ud = 0;
        int o =0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch=='U'){
                ud++;
            } else if(ch=='D'){
                ud--;
            } else if(ch=='R'){
                rl++;
            } else if(ch=='L'){
                rl--;
            } else {
                o++;
            }
        }
        rl = check(rl);
        ud = check(ud);
        return rl+ud+o;
    }
    int check(int a){
        if(a<0){
            return a*(-1);
        }
        return a;
    }
}
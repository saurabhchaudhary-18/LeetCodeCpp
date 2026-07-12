class Solution {
    public int candy(int[] ratings) {
        int t = ratings.length;
        int temp = 1;
        while(temp<ratings.length){
            if(ratings[temp]==ratings[temp-1]){
                temp++;
                continue;
            }
            int p= 0;
            while(temp<ratings.length && ratings[temp]>ratings[temp-1]){
                p++;
                t=t+p;
                temp++;
            }
            if(temp==ratings.length){
                return t;
            }
            int c=0;
            while(temp<ratings.length && ratings[temp]<ratings[temp-1]){
                c++;
                t=t+c;
                temp++;
            }
            t=t-Math.min(p,c);
        }
        return t;
    }
}
class Solution {
    public List<Integer> grayCode(int n) {
        int a = 1<<n;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<a; i++){
            res.add(i^(i>>1));
        }
        return res;
    }
}
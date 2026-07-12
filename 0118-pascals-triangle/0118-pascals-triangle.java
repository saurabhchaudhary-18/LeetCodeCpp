class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        for(int i=0; i<numRows-1; i++){
            List<Integer> dumm = new ArrayList<>();
            dumm.add(0);
            dumm.addAll(res.get(res.size()-1));
            dumm.add(0);
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<dumm.size()-1; j++){
                row.add(dumm.get(j)+dumm.get(j+1));
            }
            res.add(row);
        }
        return res;
    }
}
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        for(int i=1; i<=n; i++){
            nums.add(i);
        }
            List<List<Integer>> ans = new ArrayList<>();
            func(nums,ans,k,new ArrayList<>(),0);
        return ans;
    }
    void func(List<Integer> nums, List<List<Integer>> ans, int k, List<Integer> c, int ind){
        if(c.size()==k){
            ans.add(new ArrayList<>(c));
            return;
        }
        for(int i=ind; i<nums.size(); i++){
            int num =nums.get(i);
            c.add(num);
            func(nums,ans,k,c,i+1);
            c.remove(c.size()-1);
        }

    }

}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> temp = new ArrayList();
        helper(candidates,target,temp,ans,0);
        return ans;
    }
    public void helper(int[] candidates, int target,List<Integer> temp,List<List<Integer>> list,int i){
        if(target < 0 || i > candidates.length-1) return;
        if(target == 0) {
            list.add(temp);
            return;
        }
        List<Integer> tt = new ArrayList(temp);
        tt.add(candidates[i]);
        helper(candidates,target - candidates[i],tt,list,i);
        helper(candidates,target,temp,list,i+1);
    }
}
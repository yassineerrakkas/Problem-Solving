class Solution {
    List<List<Integer>> list = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList();
        helper(candidates,target,temp,0);
        return list;
    }
    public void helper(int[] candidates, int target,List<Integer> temp,int i){
        if(target < 0 || i > candidates.length-1) return;
        if(target == 0) {
            list.add(temp);
            return;
        }
        List<Integer> tt = new ArrayList(temp);
        tt.add(candidates[i]);
        helper(candidates,target - candidates[i],tt,i);
        helper(candidates,target,temp,i+1);
    }
}
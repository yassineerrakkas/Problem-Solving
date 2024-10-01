public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(res, new ArrayList<>(), used, nums);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> list, boolean[] used, int[] nums) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                list.add(nums[i]);
                used[i] = true;
                helper(res, list, used, nums);
                list.remove(list.size() - 1);
                used[i] = false;
            }
        }
    }
}
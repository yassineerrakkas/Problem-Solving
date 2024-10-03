public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        helper(res,"",n,n);
        return res;
    }
    public void helper(List<String> res, String temp, int n, int m ){
        if (n  == 0 && m == 0){
            res.add(temp);
            return;
        }
        if(n > 0){
            helper(res,temp+"(",n-1,m);
        }
        if(m > n){
            helper(res,temp+")",n,m-1);
        }
    }
}
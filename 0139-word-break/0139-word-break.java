class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        Set<String> set = new HashSet<>(wordDict);
        dp[s.length()] = true;
        for(int i = s.length()-1; i>-1; i--){
            for(String w : set){
                if(i+w.length() <= s.length() && s.substring(i,i+w.length()).equals(w))
                    dp[i] = dp[i+w.length()];
                if (dp[i])
                    break;
            }
        }
        return dp[0];

    }
}
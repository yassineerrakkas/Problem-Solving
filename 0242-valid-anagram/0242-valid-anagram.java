class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean [] acc = new boolean[26];
        for(char c : s.toCharArray()){
            acc[c-'a'] = !acc[c - 'a'];
        }
        for(char c : t.toCharArray()){
            acc[c-'a'] = !acc[c - 'a'];
        }
        for(boolean b : acc){
            if(b) return false;
        }
        return true;
    }
}

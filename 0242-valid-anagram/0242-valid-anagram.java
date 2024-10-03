class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] acc = new int[26];
        for(char c : s.toCharArray()){
            acc[c-'a'] += 1;
        }
        for(char c : t.toCharArray()){
            acc[c-'a'] -=1;
        }
        for(int i : acc){
            if(i != 0) return false;
        }
        return true;
    }
}

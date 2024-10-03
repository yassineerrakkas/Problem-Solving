class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int [] acc = new int[26];
        for(int i = 0; i < s.length(); i++){
            acc[s.charAt(i) - 'a']++;
            acc[t.charAt(i) - 'a']--;
        }
        for(int i : acc){
            if(i != 0) return false;
        }
        return true;
    }
}

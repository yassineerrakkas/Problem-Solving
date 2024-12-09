class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int [] count = new int[26];
        int [] index = new int[26];
        for(int i = 0; i<n;i++){
            char c = s.charAt(i);
            count[c-'a'] +=1;
            index[c-'a'] = i;
        }
        for(int i = 0; i<n;i++){
            if(count[s.charAt(i) -'a'] == 1){
                return index[s.charAt(i) -'a'];
            }
        }
        return -1;
    }
} 
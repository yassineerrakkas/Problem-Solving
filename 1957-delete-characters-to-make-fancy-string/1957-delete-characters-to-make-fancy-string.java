class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        char temp = s.charAt(0);
        ans.append(temp);
        for(int i = 1; i <s.length(); i++){
            if(s.charAt(i) == temp){
                count++;
            }else{
                temp = s.charAt(i);
                count = 0;
            }
            if(count < 2){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
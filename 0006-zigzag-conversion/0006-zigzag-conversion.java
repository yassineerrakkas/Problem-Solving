class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        int m = 2*(numRows-1);
        StringBuilder res = new StringBuilder();
        for(int row = 0; row<numRows; row++){
            if (row == 0 || row == numRows-1){
                int i = row;
                while(i<s.length()){
                    res.append(s.charAt(i));
                    i +=m;
                }
            }else{
                int i = row;
                int j = m-row;
                while(i < s.length()){
                    res.append(s.charAt(i));
                    i += m;
                    if(j <s.length()){
                        res.append(s.charAt(j));
                        j += m;
                    }
                }
            }
        }
        return res.toString();
    }
}
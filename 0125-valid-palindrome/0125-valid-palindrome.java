class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (i < j && !(Character.isLetter(chars[i]) || Character.isDigit(chars[i]))) i++;
            while (i < j && !(Character.isLetter(chars[j]) || Character.isDigit(chars[j])) ) j--;
            if (chars[i] != chars[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}

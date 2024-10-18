class Solution {
    public int maximumSwap(int num) {
        char[] characters = Integer.toString(num).toCharArray();
        int[] pos = new int[characters.length];
        pos[pos.length-1] = pos.length-1;
        for(int i = pos.length-2; i>=0; i--){
            if(characters[i] - 'a'> characters[pos[i+1]] - 'a')
                pos[i] = i;
            else pos[i] = pos[i+1];
        }
        for(int i = 0; i< pos.length; i++){
            if(characters[i] - 'a'< characters[pos[i]] - 'a'){
                char temp = characters[pos[i]];
                characters[pos[i]] = characters[i];
                characters[i] = temp;
                break;
            }
        }
        
        return Integer.valueOf(new String(characters));
    }
}
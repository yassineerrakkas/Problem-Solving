class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray); 
            String sortedKey = new String(charArray);

            List<String> listOfValues = map.getOrDefault(sortedKey, new ArrayList<>()); 
            listOfValues.add(s);
            map.put(sortedKey, listOfValues);
        }

        for (List<String> element : map.values()) {
            res.add(element);
        }

        return res;
    }
}

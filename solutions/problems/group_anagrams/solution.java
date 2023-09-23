class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word: strs) {
            char[] chars = word.toCharArray();

            Arrays.sort(chars);
            String sortedWord = new String(chars);
            List<String> list = map.getOrDefault(sortedWord, new ArrayList<String>());
            list.add(word);
            map.put(sortedWord, list);
        }

        return new ArrayList<>(map.values());
    }
}
class Solution {
    public int countCharacters(String[] words, String chars) {
            HashMap<Integer, Integer> charMap = getMap(chars);
            int result = 0;

            for(String word: words) {
                HashMap<Integer, Integer> wordMap = getMap(word);
                boolean skip = false;
                for(Map.Entry<Integer, Integer> entry: wordMap.entrySet()) {
                    if(charMap.getOrDefault(entry.getKey(), 0) < entry.getValue()) {
                        skip = true;
                    }
                }

                if(!skip) result += word.length(); 
            }

            return result;
    }

    public HashMap<Integer, Integer> getMap(String chars) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Character ch: chars.toCharArray()) {
            map.put(ch-'a', map.getOrDefault(ch-'a', 0)+1);
        }

        return map;
    }
}
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mMap = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++) {
            mMap.put(magazine.charAt(i), mMap.getOrDefault(magazine.charAt(i), 0)+1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {
            mMap.put(ransomNote.charAt(i), mMap.getOrDefault(ransomNote.charAt(i), 0)-1);
            if(mMap.get(ransomNote.charAt(i)) < 0)
                return false;
        }

        return true;
    }
}
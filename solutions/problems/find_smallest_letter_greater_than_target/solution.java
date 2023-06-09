class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int targetInt = target - 'a';
        int difference = Integer.MAX_VALUE;
        char result = letters[0];
        for(int i = 0; i < letters.length; i++) {
            if(letters[i] - 'a' > 0 && letters[i] > target && letters[i] - 'a' < difference) {
                difference = letters[i] - 'a';
                result = letters[i];
            }
        }

        return result;
    }
}
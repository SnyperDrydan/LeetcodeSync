class Solution {
    
    List<String> result = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {

    backTrack(0, 0, n, "");
    return result;
    }

    public void backTrack(int open, int close, int n, String str) {
        if(open == close && close == n) {
            result.add(str);
            return;
        }

        if(open < n) {
            backTrack(open+1, close, n, str+"(");
        }

        if(close < open) {
            backTrack(open, close+1, n, str+")");
        }
    }


}
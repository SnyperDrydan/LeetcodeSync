class Solution {
    public String simplifyPath(String path) {
        Stack stack = new Stack();
        for(String str: path.split("/")) {
            if(str.equals("..")) {
                if(stack.size() > 0) {
                    stack.pop();
                } else {
                    continue;
                }
            } else if(str.equals("") || str.equals(".")) {
                continue;
            } else {
                stack.push(str);
            }
        }
        String res = "";
        while(stack.size() > 0) {
            res = "/" + stack.pop() + res;
        }

        if(res.isEmpty())
            res = "/";

        return res;
    }
}
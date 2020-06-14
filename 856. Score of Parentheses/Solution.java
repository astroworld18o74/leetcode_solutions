class Solution {
    public int scoreOfParentheses(String S) {
        int result=0,depth=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')depth++;
            else{
                depth--;
                if(S.charAt(i-1)=='(')
                    result+=1<<depth;
            }
        }
        return result;
    }
}

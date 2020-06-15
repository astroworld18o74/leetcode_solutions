class Solution {
    public boolean isValid(String S) {
        Stack<Character> stack=new Stack<>();
        for(char s: S.toCharArray()){
            if(s=='c'){
                if(stack.isEmpty() || stack.pop()!='b')return false;
                if(stack.isEmpty() || stack.pop()!='a')return false;
            }
            else
                stack.push(s);
        }
        return stack.isEmpty();
    }
}

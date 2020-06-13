class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(s);
        Stack<Integer> st=new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')st.add(i);
            if(sb.charAt(i)==')'){
                if(!st.isEmpty())st.pop();
                else sb.setCharAt(i,'*');
            }
        }
        while(!st.isEmpty())
            sb.setCharAt(st.pop(),'*');
        return sb.toString().replaceAll("\\*","");
    }
}

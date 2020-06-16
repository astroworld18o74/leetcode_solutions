class Solution {
    public String smallestSubsequence(String text) {
        Stack<Integer> stack=new Stack<>();
        int[] last=new int[26],seen=new int[26];
        for(int i=0;i<text.length();i++)
            last[text.charAt(i)-'a']=i;
        for(int i=0;i<text.length();i++){
            int t=text.charAt(i)-'a';
            if(seen[t]++>0)continue;
            while(!stack.isEmpty() && stack.peek()>t && i<last[stack.peek()])
                seen[stack.pop()]=0;
            stack.push(t);
        }
        StringBuilder res=new StringBuilder();
        for(int i: stack)res.append((char)('a'+i));
        return res.toString();
    }
}

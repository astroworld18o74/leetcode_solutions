class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,current=1,result=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))current++;
            else{
                result+=Math.min(current,prev);
                prev=current;
                current=1;
            }
        }
        return result+Math.min(current,prev);
    }
}

class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1)return "";
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            int l1=fn(s,i,i);
            int l2=fn(s,i,i+1);
            int l=Math.max(l1,l2);
            if(l>end-start){
                start=i-(l-1)/2;
                end=i+l/2;
            }
        }
        
        return s.substring(start,end+1);
    }
    private int fn(String s,int left,int right){
        int L=left,R=right;
        while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}

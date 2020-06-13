class Solution {
    public int countSubstrings(String s) {
        int n=s.length(),res=0;
        for(int i=0;i<2*n;i++){
            int left=i/2;
            int right=left+i%2;
            while(left>=0 && right<n && s.charAt(left--)==s.charAt(right++))
                res++;
        }
        return res;
    }
}

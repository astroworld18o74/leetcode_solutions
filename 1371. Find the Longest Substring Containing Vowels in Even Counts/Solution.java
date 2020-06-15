class Solution {
    char[] c={1,0,0,0,2,0,0,0,4,0,0,0,0,0,8,0,0,0,0,0,16,0,0,0,0,0};
    public int findTheLongestSubstring(String s) {
        int mask=0, res=0;
        int[] m=new int[32];
        Arrays.fill(m,-1);
        for(int i=0;i<s.length();i++){
            mask^=c[s.charAt(i)-'a'];
            if(mask!=0 && m[mask]==-1)
                m[mask]=i;
            res=Math.max(res,i-m[mask]);
        }
        return res;
    }
}

class Solution {
    public String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {
        int n=S.length();
        int[] match=new int[n];
        Arrays.fill(match,-1);
        for(int i=0;i<indexes.length;i++){
            int ix=indexes[i];
            if(S.substring(ix,ix+sources[i].length()).equals(sources[i]))
                match[ix]=i;
        }
        StringBuilder res=new StringBuilder();
        int ix=0;
        while(ix<n){
            if(match[ix]>=0){
                res.append(targets[match[ix]]);
                ix+=sources[match[ix]].length();
            }
            else res.append(S.charAt(ix++));
        }
        return res.toString();
    }
}

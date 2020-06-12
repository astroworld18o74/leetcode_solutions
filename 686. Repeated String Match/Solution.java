class Solution {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder s=new StringBuilder(A);
        int i=1;
        for(;s.length()<B.length();i++)s.append(A);
        if(s.indexOf(B)>=0)return i;
        if(s.append(A).indexOf(B)>=0)return i+1;
        return -1;
    }
}

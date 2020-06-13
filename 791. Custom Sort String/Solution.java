class Solution {
    public String customSortString(String S, String T) {
        int[] temp=new int[26];
        for(char c: T.toCharArray())
            temp[c-'a']++;
        StringBuilder res=new StringBuilder();
        for(char c: S.toCharArray())
            while(temp[c-'a']-->0)
                res.append(c);
        for(char c: T.toCharArray())
            while(temp[c-'a']-->0)
                res.append(c);
        return res.toString();
    }
}

class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res=new ArrayList<>();
        char[] pa=pattern.toCharArray();
        for(String word: queries){
            boolean x=match(word.toCharArray(),pa);
            res.add(x);
        }
        return res;
    }
    private boolean match(char[] word,char[] pattern){
        int j=0;
        for(int i=0;i<word.length;i++){
            if(j<pattern.length && word[i]==pattern[j])
                j++;
            else if(word[i]>='A' && word[i] <='Z')
                return false;
        }
        return j==pattern.length;
    }
}

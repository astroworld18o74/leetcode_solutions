class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> results=new ArrayList<>();
        for(String word: words)
            if(fn(word,pattern))
                results.add(word);
        return results;
    }
    public boolean fn(String word,String pattern){
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            if(!map.containsKey(w))map.put(w,p);
            if(map.get(w)!=p)return false;
        }
        boolean[] seen=new boolean[26];
        for(char c: map.values()){
            if(seen[c-'a'])return false;
            seen[c-'a']=true;
        }
        return true;
    }
}

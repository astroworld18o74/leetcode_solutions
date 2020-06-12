class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph+=".";
        Set<String> set=new HashSet<>();
        for(String s: banned)
            set.add(s);
        Map<String,Integer> map=new HashMap<>();
        int max=0;
        String ans="";
        StringBuilder word=new StringBuilder();
        for(char c: paragraph.toCharArray()){
            if(Character.isLetter(c))
                word.append(Character.toLowerCase(c));
            else if(word.length()>0){
                String fw=word.toString();
                if(!set.contains(fw)){
                    map.put(fw,map.getOrDefault(fw,0)+1);
                    if(map.get(fw)>max){
                        ans=fw;
                        max=map.get(fw);
                    }
                }
                word=new StringBuilder();
            }
        }
        return ans;
    }
}

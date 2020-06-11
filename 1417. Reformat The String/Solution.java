class Solution {
    public String reformat(String s) {
        List<Character> c=new ArrayList<>();
        List<Character> n=new ArrayList<>();
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch))
                n.add(ch);
            else
                c.add(ch);
        }
        if(Math.abs(n.size()-c.size())>=2)return "";
        StringBuilder res=new StringBuilder();
        boolean nn=(n.size()>=c.size())? true:false;
        for(int i=0;i<s.length();i++){
            if(nn){
                if(n.size()>0)
                    res.append(n.remove(0));
            }
            else{
                if(c.size()>0)
                    res.append(c.remove(0));
            }
            nn=!nn;
        }
        return res.toString();
    }
}

class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=ss.length-1;i>=0;i--){
            if(ss[i].equals(""))continue;
            res.append(ss[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}

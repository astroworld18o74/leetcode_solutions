class Solution {
    public List<String> printVertically(String s) {
        String[] temp=s.split(" ");
        List<String> res=new ArrayList<>();
        int max=-1;
        for(int i=0;i<s.length();i++){
            if(i==max)return res;
            StringBuilder t=new StringBuilder();
            boolean x=true;
            for(int j=0;j<temp.length;j++){
                max=Math.max(max,temp[j].length());
                if(i>=temp[j].length())t.append(" ");
                else{
                    t.append(temp[j].charAt(i));
                    x=false;
                }
            }
            while (t.charAt(t.length() - 1) == ' ')
                t.deleteCharAt(t.length() - 1);
            res.add(t.toString());
        }
        return res;
    }
}

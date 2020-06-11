class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,(log1,log2)->{
            String[] s1=log1.split(" ",2);
            String[] s2=log2.split(" ",2);
            boolean a=Character.isDigit(s1[1].charAt(0));
            boolean b=Character.isDigit(s2[1].charAt(0));
            if(!a && !b){
                int c=s1[1].compareTo(s2[1]);
                if(c!=0)return c;
                return s1[0].compareTo(s2[0]);
            }
            return a?(b?0:1):-1;
        });
        return logs;
    }
}

class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] s11=s1.toCharArray();
        char[] s22=s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        boolean x=false;
        int c=0;
        for(int i=0;i<s11.length;i++){
            if(s11[i]==s22[i])continue;
            if(c!=0){
                boolean cc;
                cc=(s11[i]>s22[i])?false:true;
                if(cc!=x)return false;
            }
            else{
                c=1;
                x=(s11[i]>s22[i])?false:true;
            }
        }
        return true;
    }
}

class Solution {
    public boolean checkRecord(String s) {
        int ca=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                ca++;
                if(ca>=2)return false;
            }
            if(i>1 && s.charAt(i)=='L'&& s.charAt(i-1)=='L' && s.charAt(i-2)=='L')return false;
        }
        return true;
    }
}

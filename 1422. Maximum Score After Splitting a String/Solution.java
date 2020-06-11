class Solution {
    public int maxScore(String s) {
        int z=0,o=0;
        for(char ch: s.toCharArray()){
            if(ch=='0')z++;
            else o++;
        }
        if(z==0 || o==0) return z==0? o-1:z-1;
        int max=0,zz=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0')zz++;
            else o--;
            int count=zz+o;
            max=Math.max(max,count);
        }
        return max;
    }
}

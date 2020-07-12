class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] f=new int[5];
        int res=0;
        int c=0;
        for(char ch: croakOfFrogs.toCharArray()){
            if(ch=='c')f[0]++;
            else if(ch=='r')f[1]++;
            else if(ch=='o')f[2]++;
            else if(ch=='a')f[3]++;
            else if(ch=='k')f[4]++;
            else return -1;
            
            boolean flag=((f[0]>=f[1])&&(f[1]>=f[2])&&(f[2]>=f[3])&&(f[3]>=f[4]));
            if(flag==false)return -1;
            if(ch=='c')c++;
            else if(ch=='k')c--;
            
            res=Math.max(res,c);
        }
        return c==0?res:-1;
    }
}

class Solution {
    public int maxRepOpt1(String text) {
        int[] freq=new int[26];
        for(int i=0;i<text.length();i++)
            freq[text.charAt(i)-'a']++;
        int s=0,maxcount=0,res=0;
        char maxchar='#';
        int[] count=new int[26];
        for(int f=0;f<text.length();f++){
            if(++count[text.charAt(f)-'a']>maxcount){
                maxcount=count[text.charAt(f)-'a'];
                maxchar=text.charAt(f);
            }
            while(f-s+1-maxcount>1)
                --count[text.charAt(s++)-'a'];
            res=Math.max(res,Math.min(freq[maxchar-'a'],f-s+1));
        }
        return res;
    }
}

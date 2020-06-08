class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        int max=0,n=barcodes.length;
        int [] freq=new int[10001],ans=new int[n];
        for(int i: barcodes)
            if(++freq[i]>freq[max])
                max=i;
        int i=0;//ch=0;
        for(int j=0;j<freq.length;j++){
            int code=j==0?max:j;
            while(freq[code]-->0){
                ans[i]=code;
                i=i+2<n?i+2:1;
                //ch++;
            }
            /*if(ch>=n)
                return ans;*/
        }
        return ans;
    }
}

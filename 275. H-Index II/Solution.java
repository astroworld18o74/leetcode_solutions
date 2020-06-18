class Solution {
    public int hIndex(int[] citations) {
        int l=0,h=citations.length-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(citations[m]==citations.length-m)return citations.length-m;
            else if(citations[m]<citations.length-m)l=m+1;
            else h=m-1;
        }
        return citations.length-l;
    }
}

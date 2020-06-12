class Solution {
    public String reverseStr(String s, int k) {
        char[] temp=s.toCharArray();
        for(int start=0;start<temp.length;start+=2*k){
            int i=start,j=Math.min(start+k-1,temp.length-1);
            while(i<j){
                char tmp=temp[i];
                temp[i++]=temp[j];
                temp[j--]=tmp;
            }
        }
        return new String(temp);
    }
}

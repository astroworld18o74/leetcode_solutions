class Solution {
    public int expressiveWords(String S, String[] words) {
        rle r=new rle(S);
        int ans=0;
        search: for(String word: words){
            rle r2=new rle(word);
            if(!r.key.equals(r2.key))continue;
            for(int i=0;i<r.counts.size();i++){
                int c1=r.counts.get(i);
                int c2=r2.counts.get(i);
                if(c1<3 && c1!=c2 || c1<c2)
                    continue search;
            }
            ans++;
        }
        return ans;
    }
}
class rle{
    String key;
    List<Integer> counts;
    public rle(String S){
        StringBuilder sb=new StringBuilder();
        counts=new ArrayList<>();
        char[] ca=S.toCharArray();
        int n=ca.length;
        int prev=-1;
        for(int i=0;i<n;i++)
            if(i==n-1 || ca[i]!=ca[i+1]){
                sb.append(ca[i]);
                counts.add(i-prev);
                prev=i;
            }
        key=sb.toString();
    }
}

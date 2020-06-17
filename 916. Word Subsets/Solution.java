class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax=count("");
        for(String b: B){
            int [] bcount=count(b);
            for(int i=0;i<26;i++)
                bmax[i]=Math.max(bmax[i],bcount[i]);
        }
        List<String> res=new ArrayList<>();
        search: for(String a: A){
            int[] acount=count(a);
            for(int i=0;i<26;i++)
                if(acount[i]<bmax[i])
                    continue search;
            res.add(a);
        }
        return res;
    }
    public int[] count(String S){
        int[] res=new int[26];
        for(char c: S.toCharArray())
            res[c-'a']++;
        return res;
    }
}

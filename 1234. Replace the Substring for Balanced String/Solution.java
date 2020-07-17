class Solution {
    public int balancedString(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c,map.getOrDefault(c,0)+1);
        for(char c: List.of('Q','W','E','R')){
            if(map.getOrDefault(c,0)<=n/4)map.remove(c);
            else map.put(c,map.get(c)-n/4);
        }
        if(map.size()==0)return 0;
        int res=Integer.MAX_VALUE;
        for(int i=0,l=0,bal=map.size();i<n;i++){
            char c=s.charAt(i);
            if(!map.containsKey(c))continue;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0)bal--;
            while(bal==0){
                char ch=s.charAt(l++);
                if(!map.containsKey(ch))continue;
                map.put(ch,map.get(ch)+1);
                if(map.get(ch)==1){
                    res=Math.min(res,i-l+2);
                    bal++;
                }
            }
        }
        return res;
    }
}

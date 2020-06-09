class Solution {
    private Map<Integer,Integer> map=new HashMap<>();
    {
        map.put(1,0);
    }
    private int getPower(int n){
        if(map.containsKey(n))
            return map.get(n);
        int r=n%2==0?getPower(n/2):getPower(3*n+1);
        map.put(n,r+1);
        return map.get(n);
    }     
    public int getKth(int lo, int hi, int k) {
        List<Pair<Integer,Integer>> list=new ArrayList<>();
        for(int i=1;i<=hi;i++){
            int g=getPower(i);
            if(i>=lo) list.add(new Pair(i,map.getOrDefault(i,0)));
        }
        list.sort((p1, p2) -> p1.getValue() == p2.getValue() ? p1.getKey() - p2.getKey() : p1.getValue() - p2.getValue());
        return list.get(k-1).getKey();
    }
}

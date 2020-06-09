class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        Set<String>[] set=new Set[favoriteCompanies.size()];
        for(int i=0;i<favoriteCompanies.size();i++)
            set[i]=new HashSet<>(favoriteCompanies.get(i));
       List<Integer> res=new ArrayList<>();
       outer:
       for(int i=0;i<set.length;i++){
           for(int j=0;j<set.length;j++)
               if(i!=j && set[j].containsAll(set[i]))
                   continue outer;
           res.add(i);
       }
        return res;
    }
}

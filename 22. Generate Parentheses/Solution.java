class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        fn(result,"",0,0,n);
        return result;
    }
    public void fn(List<String> res,String current,int start,int end,int max){
        if(current.length()==max*2){
            res.add(current);
            return;
        }
        if(start<max)
            fn(res,current+"(",start+1,end,max);
        if(end<start)
            fn(res,current+")",start,end+1,max);
    }
}

class Solution {
    public String simplifyPath(String path) {
        if(path==null)return path;
        String[] splitpath=path.split("/");
        List<String> res=new ArrayList<>();
        for(String split:splitpath){
            if(split!=null && split.length()>0){
                if(split.equals("..")){
                    if(res.size()>0)res.remove(res.size()-1);
                }
                else if(!split.equals("."))res.add(split);
            }
        }
        StringBuilder result=new StringBuilder();
        for(String temp:res)
            result.append("/").append(temp);
        return result.length()==0?"/":result.toString();
    }
}

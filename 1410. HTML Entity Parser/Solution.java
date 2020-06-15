class Solution {
    public String entityParser(String text) {
        if(text==null || text.length()==0)return  "";
        Map<String,String> map=new HashMap<>();
        map.put("&quot;", "\"");
        map.put("&apos;", "'");
        map.put("&gt;", ">");
        map.put("&lt;", "<");
        map.put("&frasl;", "/");
        for(String key: map.keySet())
            text=text.replaceAll(key,map.get(key));
        return text.replaceAll("&amp;", "&");
    }
}

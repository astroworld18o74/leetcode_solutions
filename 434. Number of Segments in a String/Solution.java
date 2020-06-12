class Solution {
    public int countSegments(String s) {
        String t=s.trim();
        if(t.equals("")) return 0;
        return t.split("\\s+").length;//to remove extra characters like , ] , [ , /  
    }
}

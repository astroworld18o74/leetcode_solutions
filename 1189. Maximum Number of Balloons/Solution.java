class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count=new int[26];
        for(char c: text.toCharArray())
            count[c-'a']++;
        int[] check=new int[26];
        for(char c: "balloon".toCharArray())
            check[c-'a']++;
        int min=text.length();
        for(char c: "balloon".toCharArray())
            min=Math.min(min,count[c-'a']/check[c-'a']);
        return min;
    }
}

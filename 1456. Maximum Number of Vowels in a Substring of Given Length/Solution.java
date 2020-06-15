class Solution {
    public int maxVowels(String s, int k) {
        int[] p=new int[s.length()];
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int max=0,sum=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))sum++;
            if(i>=k && set.contains(s.charAt(i-k)))
                sum--;
            max=Math.max(sum,max);
        }
        return max;
        
    }
}

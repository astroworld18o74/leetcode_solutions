class Solution1 {
    public String sortString(String s) {
        int[] freq=new int[26];
        int length=s.length();
        for(int i=0;i<length;i++)
            freq[s.charAt(i)-'a']++;
        int count=0;
        StringBuilder sb=new StringBuilder();
        while(count<length){
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                }
            }
            // sorting down
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    sb.append((char) (i + 'a'));
                    freq[i] = freq[i] - 1;
                    count++;
                    
                }
            }
        }
        return sb.toString();
    }
}

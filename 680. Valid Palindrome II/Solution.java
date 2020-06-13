class Solution {
    public boolean validPalindrome(String s) {
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return fn(s,i+1,j)||fn(s,i,j-1);
            i++;
            j--;
        }
        return true;
    }
    private boolean fn(String s,int start,int end){
        while(start<end)
            if(s.charAt(start++)!=s.charAt(end--))
                return false;
        return true;
    }
}

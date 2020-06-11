class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] temp=sentence.split(" ");
        for(int i=0;i<temp.length;i++){
            if(searchWord.length()<=temp[i].length()){
                boolean x=true;
                for(int j=0;j<searchWord.length();j++)
                    if(searchWord.charAt(j)!=temp[i].charAt(j)){
                        x=false;
                        break;
                    }
                if(x==true)return i+1;
            }
        }
        return -1;
    }
}

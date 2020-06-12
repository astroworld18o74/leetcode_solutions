class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int j = 0;
        for (char c: name.toCharArray()) {
            if (j == typed.length())
                return false;

            // If mismatch...
            if (typed.charAt(j) != c) {
                // If it's the first char of the block, ans is false.
                if (j==0 || typed.charAt(j-1) != typed.charAt(j))
                    return false;

                // Discard all similar chars
                char cur = typed.charAt(j);
                while (j < typed.length() && typed.charAt(j) == cur)
                    j++;

                // If next isn't a match, ans is false.
                if (j == typed.length() || typed.charAt(j) != c)
                    return false;
            }

            j++;
        }
        for(int k=j;k<typed.length();k++){
            if(typed.charAt(k)!=name.charAt(name.length()-1))
                return false;
        }
        return true;
    }
}

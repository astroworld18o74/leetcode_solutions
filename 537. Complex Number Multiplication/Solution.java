class Solution {
    public String complexNumberMultiply(String a, String b) {
        String[] x=a.split("\\+|i");
        String[] y=b.split("\\+|i");
        int ar=Integer.parseInt(x[0]);
        int br=Integer.parseInt(y[0]);
        int ai=Integer.parseInt(x[1]);
        int bi=Integer.parseInt(y[1]);
        return (ar*br-ai*bi)+"+"+(ar*bi+ai*br)+"i";
    }
}

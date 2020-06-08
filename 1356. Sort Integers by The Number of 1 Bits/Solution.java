class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp=new Integer[arr.length];
        for (int i = 0; i < arr.length; ++i)
            temp[i] = arr[i];
        Arrays.sort(temp, Comparator.comparing(i -> Integer.bitCount(i) * 10000 + i));
        for(int i=0;i<arr.length;i++)
            arr[i]=temp[i];
        return arr;
    }
}

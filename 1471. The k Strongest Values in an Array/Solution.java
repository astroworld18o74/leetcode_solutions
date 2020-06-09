class Solution {
    public int[] getStrongest(int[] arr, int k) {
    Arrays.sort(arr);
    int i = 0, j = arr.length - 1, p = 0;
    int median = arr[(arr.length - 1) / 2];
    int[] res = new int[k];
    while (p < k)
        if (median - arr[i] > arr[j] - median)
            res[p++] = arr[i++];  
        else
            res[p++] = arr[j--];      
    return res;
}
}

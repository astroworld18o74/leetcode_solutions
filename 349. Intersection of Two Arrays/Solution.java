class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
            set.add(nums1[i]);
        int j=0;
        int[] res=new int[nums2.length];
        for(int i=0;i<nums2.length;i++)
            if(set.contains(nums2[i])){
                res[j++]=nums2[i];
                set.remove(nums2[i]);
            }
        return Arrays.copyOf(res,j);   
    }
}

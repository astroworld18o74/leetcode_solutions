class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(k<1 || t<0)return false;
        Map<Long,Long> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long temp=(long)nums[i]-Integer.MIN_VALUE;
            long bucket=temp/((long)t+1);
            if(map.containsKey(bucket) || (map.containsKey(bucket-1) && temp-map.get(bucket-1)<=t) || (map.containsKey(bucket+1) && map.get(bucket+1)-temp<=t))
                return true;
            if(map.entrySet().size()>=k){
                long lastbucket=((long)nums[i-k]-Integer.MIN_VALUE)/((long)t+1);
                map.remove(lastbucket);
            }
            map.put(bucket,temp);
        }
        return false;
    }
}

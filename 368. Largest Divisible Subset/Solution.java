class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result=new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        int[] dp=new int[nums.length];
        dp[0]=1;
        for(int i=1;i<nums.length;i++)
            for(int j=i-1;j>=0;j--)
                if(nums[i]%nums[j]==0)
                    dp[i]=Math.max(dp[i],dp[j]+1);
        int mi=0;
        for(int i=0;i<nums.length;i++)
            mi=dp[mi]>dp[i]?mi:i;
        
        int temp=nums[mi];
        int current=dp[mi];
        for(int i=mi;i>=0;i--)
            if(temp%nums[i]==0 && current==dp[i]){
                result.add(nums[i]);
                temp=nums[i];
                current--;
            }
        return result;
    }
}

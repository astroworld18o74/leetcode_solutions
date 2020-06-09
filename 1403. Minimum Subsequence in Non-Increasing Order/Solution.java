class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, sum = 0, rSum = 0;
        for (int i : nums) sum += i;
        List<Integer> res = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            rSum += nums[i];
            res.add(nums[i]);
            if (rSum > sum - rSum) return res;
        }
        return new ArrayList<>();
    }
}

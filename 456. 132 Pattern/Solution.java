class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3)return false;
        int[] temp=new int[nums.length];
        temp[0]=nums[0];
        for(int i=1;i<nums.length;i++)
            temp[i]=Math.min(nums[i],temp[i-1]);
        for(int middle=nums.length-1, last=nums.length;middle>=0;middle--){
            if(nums[middle]>temp[middle]){
                while(last<nums.length && nums[last]<=temp[middle])
                    last++;
                if(last<nums.length && nums[last]<nums[middle])return true;
                nums[--last]=nums[middle];
            }
        }
        return false;
    }
}

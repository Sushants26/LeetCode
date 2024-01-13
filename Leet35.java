class Solution {
    public int searchInsert(int[] nums, int target) {
        int i, ans=0;
        for(i=0; i<nums.length; i++)
        {
            if(target==nums[i])
            {
                ans=i;
            }
            else if(target>nums[i])
            {
                ans=i+1;
            }
        }
        return ans;
    }
}
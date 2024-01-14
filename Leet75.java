class Solution {
    public static void sort(int nums[])
    {
        for(int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public void sortColors(int[] nums) {
        int temp;
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=0; j<nums.length-i-1; j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }
        sort(nums);
    }
}
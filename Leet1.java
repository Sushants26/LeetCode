import java.util.*;
public class Leet1
{
    public int[] twoSum(int[] nums, int target) {
        int i,j;
         for(i=0; i<nums.length; i++)
        {
            for( j=1; j<nums.length; j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};   
}
}
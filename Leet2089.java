class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
      int temp=0;
      Arrays.sort(nums);
       
       ArrayList<Integer> list1=new ArrayList<Integer>();
       int high=nums.length-1;
       int low=0;

       for(int i=0; i<nums.length; i++)
       {
           if(target==nums[i])
           {
               list1.add(i);
           }
           
       }
       return list1;
    }
}
class Solution {
    public List<Integer> findPeaks(int[] mountain)
    {
        ArrayList arr=new ArrayList();
        for(int i=0+1; i<mountain.length-1; i++)
        {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
            {
                arr.add(i);
            }
            else
            {
                continue;
            }
        }
        return arr;
    }
}
class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int k = 1;

        for (int x = 1; x < nums.length; x++)
        {
            if (nums[x] != nums[k - 1])
            {
                nums[k] = nums[x];
                k++;
            }
        }
        return k;
    }
}
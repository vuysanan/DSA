class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int i = 0;

        for (int x = 0; x < nums.length; x++)
        {
            if (nums[x] != 0)
            {
                nums[i] = nums[x]; 
                i++;
            }
        }

        for (int y = i; y < nums.length; y++)
        nums[y] = 0;
    }
}
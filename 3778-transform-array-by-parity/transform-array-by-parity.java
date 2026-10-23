class Solution {
    public int[] transformArray(int[] nums) {
        int evenCount = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] % 2 == 0)
            {
                evenCount++;
            }
        }
        for (int x = 0; x < evenCount; x++)
        {
            nums[x] = 0;
        }
        for (int y = evenCount; y < nums.length; y++)
        {
            nums[y] = 1;
        }
        return nums;
    }
}
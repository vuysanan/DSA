/*class Solution 
{
    // sort in descending order then return value in kth position

    public int findKthLargest(int[] nums, int k) 
    {
        int minPos = 0;

        if (nums.length == 1)
            return nums[0];

        for (int pass = 1; pass < nums.length; pass++)
        {
            for (int x = pass; x < nums.length; x++)
            {
                int first = nums[x];
                int second = nums[minPos];
                if (first > second)
                    minPos = x;    
            }
            swop(pass - 1, minPos, nums);
            minPos = pass;
        }
        return nums[k - 1];
    }

    private void swop(int left, int right, int[] nums)
    {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
    }
}*/

import java.util.Arrays;

class Solution
{
    public int findKthLargest(int[] nums, int k)
    {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
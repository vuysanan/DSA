import java.util.Arrays;

class Solution 
{
    // will traverse the array compare the current value to the next value if whether of not they are equal
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
        {
            if (nums[i] == nums[i + 1])
            return true;
        }
        return false;
    }
}

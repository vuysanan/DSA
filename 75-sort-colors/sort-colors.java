class Solution 
{
    // required to sort the elements(colours) in ascending order
    // using bubble sort..
    // on first pass compare the first array element to the second
    // if first element is greater than second then swop them so that second is now first
    // continue the same process for entire array

    public void sortColors(int[] nums) 
    {
        for (int pass = 1; pass < nums.length; pass++)
        {
            for (int compare = 1; compare <= nums.length - pass; compare++)
            {
                int first = nums[compare - 1];
                int second = nums[compare];
                if (first > second)
                    swop(compare, compare - 1, nums);
            }
        }
    }

    private void swop(int num1, int num2, int[] nums)
    {
        int temp = nums[num2];
        nums[num2] = nums[num1];
        nums[num1] = temp;
    }
}
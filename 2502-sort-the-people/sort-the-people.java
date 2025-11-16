class Solution 
{
    // compare heights and swop names accordingly

    public String[] sortPeople(String[] names, int[] heights) 
    {
        for (int pass = 1; pass < heights.length; pass++)
        {
            for (int compare = 1; compare <= heights.length - pass; compare++)
            {
                int left = heights[compare - 1];
                int right = heights[compare];
                if (left < right)
                {
                    swopNames(compare - 1, compare, names);   
                    swopHeights(compare - 1, compare, heights);
                }             
            }
        }
        return names;
    }

    private void swopNames(int left, int right, String[] names)
    {
        String temp = names[right];
        names[right] = names[left];
        names[left] = temp;
    }

    private void swopHeights(int left, int right, int[] heights)
    {
        int temp = heights[right];
        heights[right] = heights[left];
        heights[left] = temp;
    }
}
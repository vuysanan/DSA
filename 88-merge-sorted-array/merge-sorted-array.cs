public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        int counter = 0, length = m + n;

        for (int x = m; x < length; x++)
        {
            nums1[x] = nums2[counter];
            counter++;
        }
        Array.Sort(nums1);
    }
}
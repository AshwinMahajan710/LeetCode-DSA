// Page 3 arrays...
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int point1 = m - 1;
        int point2 = n - 1;
        int add = m + n - 1; // Updated add to point to the last index of nums1
        
        while (point1 >= 0 && point2 >= 0) {
            if (nums1[point1] > nums2[point2]) {
                nums1[add] = nums1[point1];
                point1--;
            } else {
                nums1[add] = nums2[point2];
                point2--;
            }
            add--;
        }
        
        // Copy remaining elements from nums2 if any
        while (point2 >= 0) {
            nums1[add] = nums2[point2];
            point2--;
            add--;
        }
    }
}
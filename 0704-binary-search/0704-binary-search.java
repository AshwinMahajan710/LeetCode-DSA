// This is binary search implementation ... array pg no 3
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target) return 0;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int val = (end+start)/2;
            if(target>nums[val]) start = val+1;
            else if(target<nums[val]) end = val-1;
            else if(target==nums[val]) return val;
        }
        return -1;
    }
}
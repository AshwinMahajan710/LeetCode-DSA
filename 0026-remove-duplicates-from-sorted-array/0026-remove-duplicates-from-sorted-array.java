// Page 3..array
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1) return 1;
        int point = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[point] = nums[i];
                point++;
            }
        }
        return point;
    }
}
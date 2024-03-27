// Sliding window approach beats 98% space complexity
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            int result = nums[i];
            for(int j=i+1;j<nums.length;j++){
                result *= nums[j];
                if(result<k) count++;
                else break;
            }
            if(nums[i]<k) count++;
        }
        if(nums[nums.length-1]<k) count++;

        return count;
    }
}

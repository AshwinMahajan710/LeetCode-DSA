// This approach is better at space but previous was best at runtime arrays page7
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) count++;
            else count = 0;
            max = Math.max(count,max);
        }
        return max;
    }
}



/* Better runtime
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int start = 0;
        int end = 0;
        int count = 0;
        while(start<nums.length && end < nums.length){
            int maxCount = 0;
            while(start<nums.length && nums[start]!=1){
                start++;
                end++;
            }
            while(end<nums.length && nums[end]==1){
                end++;
                maxCount++;
            }
            count = Math.max(maxCount,count);
            start = end;
        }
        return count;
    }
}*/
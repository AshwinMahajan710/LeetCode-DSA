// Best runtime not much memory efficient.....
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;
        int res[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                res[even] = nums[i];
                even += 2;
            }
            else{
                res[odd] = nums[i];
                odd+=2;
            }
        }
        return res;
    }
}

// Space efficient
/*
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int point = i;
            if(nums[i]==-1) continue;
            if(nums[i]%2==i%2) arr[i] = nums[i];
            else{
                while(nums[point]%2!=i%2) point++;
                arr[i] = nums[point];
                int temp = nums[i];
                nums[i] = nums[point];
                nums[point] = temp;
            }
        }
        return arr;
    }
}
*/
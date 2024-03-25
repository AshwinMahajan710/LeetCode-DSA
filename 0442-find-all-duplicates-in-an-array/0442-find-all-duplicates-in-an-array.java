// For explanantion (Array Patterns -: pg 1)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int abs = 0;
        int idx_to_check = 0;
        for(int i=0;i<nums.length;i++){
            abs = Math.abs(nums[i]);
            idx_to_check = abs-1;
            if(nums[idx_to_check]<0) arr.add(abs);
            else nums[idx_to_check] = -nums[idx_to_check];
        }
        return arr;
    }
}

// This is my first thought

/*class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) arr.add(nums[i]);
            else set.add(nums[i]);
        }
        return arr;
    }
}*/
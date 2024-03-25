class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])) arr.add(nums[i]);
            else set.add(nums[i]);
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
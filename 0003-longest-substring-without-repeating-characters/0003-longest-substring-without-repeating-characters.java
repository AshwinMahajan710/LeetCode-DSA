// best solution view book page 7 Array
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxCount = 0;
        int count = 0;
        while(start<=end && end<s.length()){
            if(set.contains(s.charAt(end))){
                while(s.charAt(end)!=s.charAt(start)){
                    set.remove(s.charAt(start));
                    start++;
                    count--;
                }
                start++;
            }
            else{
                set.add(s.charAt(end));
                count++;
            }
            end++;
            maxCount = count>maxCount ? count : maxCount;
        } 
        return maxCount;
    }
}
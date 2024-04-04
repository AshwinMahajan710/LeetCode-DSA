// easy question
class Solution {
    public int maxDepth(String s) {
        Stack <Character> st = new Stack<>();
        int maxCount = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count ++;
                maxCount = Math.max(count,maxCount);
            }
            else if(s.charAt(i)==')'){
                count--;
            }
        }
        return maxCount;
    }
}
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return false;
        int first = 0;
        for(int i=0;i<t.length();i++){
            if(s.charAt(first)==t.charAt(i)) first++;
            if(first>=s.length()) return true;
        }
        return false;
    }
}
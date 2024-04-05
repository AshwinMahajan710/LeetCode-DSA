// Not that much difficult
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> lt = new ArrayList<>();
        if (s.length() <= 10)
            return lt;
        int start = 0;
        int end = 9;
        HashMap<String, Integer> st = new HashMap<>();
        while (end < s.length()) { // this two condition while written together dont give effective answer
            if (st.containsKey(s.substring(start, end + 1))) {
                if (st.get(s.substring(start, end + 1)) == 0) {
                    lt.add(s.substring(start, end + 1));
                    st.put(s.substring(start, end + 1), 1);
                }
            } else {
                st.put(s.substring(start, end + 1), 0);
            }
            start++;
            end++;
        }
        return lt;
    }
}
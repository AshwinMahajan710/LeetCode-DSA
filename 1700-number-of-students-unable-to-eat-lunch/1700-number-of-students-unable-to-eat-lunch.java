class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack <Integer> st = new Stack<>();
        Queue <Integer> q = new LinkedList<>();
        int rotation = 0;
        int count = 0;
        for(int i=0;i<students.length;i++) q.add(students[i]);
        for(int i=sandwiches.length-1;i>=0;i--) st.push(sandwiches[i]);
        while(rotation<q.size()){
            int stu = q.remove();
            if(stu==st.peek()){
                st.pop();
                count++;
                rotation = 0;
            }
            else{
                q.add(stu);
                rotation++;
            }
        }
        return students.length - count;
    }
}
// best Approach page2 arrays....
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            if((numbers[start]+numbers[end])>target) end--;
            else if((numbers[start]+numbers[end])<target) start++;
            else return new int[] {start+1,end+1};
        }
        return new int[] {};
    }
}



/*
Common Thinking...
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(target-numbers[i])) return new int[] {map.get(target-numbers[i])+1,i+1};
            else
                map.put(numbers[i],i);
            
        }
        return new int []{};
    }
}*/
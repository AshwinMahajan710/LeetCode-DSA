// better one
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        int point=0;
        while(true){

            if(tickets[point]==0){
                point++;
                if(point == tickets.length) point=0;
                continue;
            } 

            tickets[point]-=1;
            count++;
            if(tickets[k]==0) return count;
            point++;
            if(point == tickets.length) point=0;
        }
    }
}


// one way
/*class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        Queue <Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++)
            q.add(tickets[i]);
        while(true){
            int stat = q.remove()-1;
            count++;
            if(k==0 && stat==0) return count;
            if(stat!=0) q.add(stat);
            if(k==0) k =q.size()-1;
            else k--;
        }
    }
}*/
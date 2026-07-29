class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gases =0 ,costs=0;
        int n =gas.length;
        for(int i=0;i<n;i++){
            gases += gas[i];
            costs += cost[i];
        }
        if(gases<costs) return -1;
        int total=0;
        int start = 0;
        for(int i=0;i<n;i++){
            total += gas[i] -cost[i];
            if(total < 0){
                total = 0;
                start= (i+1);
            }

        }
        return start;
    }
}

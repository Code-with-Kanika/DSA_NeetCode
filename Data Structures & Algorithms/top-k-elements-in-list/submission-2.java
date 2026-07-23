class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> count = new HashMap<>();
        for (int i: nums){
            count.put(i , count.getOrDefault(i,0) +1);
        }
        
        List<Integer>[] freq = new List[nums.length + 1];
        for(int i=0;i<freq.length ;i++){
            freq[i] = new ArrayList<>();
        }
        
        for(Map.Entry<Integer,Integer> ent: count.entrySet()){
            freq[ent.getValue()].add(ent.getKey());
        }

        int[] res= new int[k];
        int ind=0;
        for(int i=freq.length - 1; i>0 && ind<k ;i--){
            for(int j : freq[i]){
                res[ind++] = j;
                if(ind ==k){
                    return res;
                }
            }
        }
        return res;
    }
}




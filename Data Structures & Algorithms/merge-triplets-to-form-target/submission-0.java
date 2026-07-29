class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        // sort on first element then second & then third ; find last occ of element == target[0]
        // & then move to left to find target[1] &then target[2],
        //If fail anywhere , return false;
        Set<Integer> good = new HashSet<>();

        for(int[] t : triplets){
            int x= t[0];
            int y=t[1];
            int z= t[2];

            if(x>target[0] || y> target[1] || z>target[2]){
                continue;
            }
            
            for(int j=0;j<t.length;j++){
                if(t[j] == target[j]){
                    good.add(j);
                }
            }

        }

        return good.size() == 3;
        
    }
}

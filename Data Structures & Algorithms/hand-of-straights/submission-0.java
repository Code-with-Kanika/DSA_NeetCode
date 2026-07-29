class Solution {
    public boolean isNStraightHand(int[] nums, int groupSize) {
        if (nums.length % groupSize != 0) {
            return false;
        }
        HashMap<Integer,Integer> hmap= new HashMap<>();
        for(int i: nums){
            hmap.put(i , hmap.getOrDefault(i ,0)+1);
        }
        Arrays.sort(nums);
        int n =nums.length;
        for(int i=0; i<n;i++){
            if(!hmap.containsKey(nums[i])) continue;
            for(int j=0 ; j< groupSize;j++){
                if(!hmap.containsKey(nums[i]+j)){
                    return false;
                }
                int freq = hmap.get(nums[i]+j);

                if(freq == 1) hmap.remove(nums[i]+j);
                else hmap.put(nums[i]+j , freq-1);
            }

        }
        return true;
    }
}

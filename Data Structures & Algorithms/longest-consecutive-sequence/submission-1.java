class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hset = new HashSet<>();
        int len=0;
        for (int num : nums) {
            hset.add(num);
            len+=1;
        }
        if (len ==0 ){
            return 0;
        }
        int longest =1;
        for(int i=0;i<len;i++){
            int count =1;
            if(!hset.contains(nums[i]-1)){
                int val = nums[i]+1;
                while(hset.contains(val)){
                    count += 1;
                    val += 1;
                }
            }
            longest = Math.max(longest,count);
        }
        return longest;
            
    }
}

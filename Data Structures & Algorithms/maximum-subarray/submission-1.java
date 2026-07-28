class Solution {
    public int maxSubArray(int[] nums) {
        
        int cur=nums[0];
        int maxi=nums[0];
        for(int i=1;i<nums.length;i++){

            if(cur<0){
                cur = 0;
            }
            cur += nums[i];
            maxi=Math.max(maxi,cur);
            
        }

        return maxi;
    }
}


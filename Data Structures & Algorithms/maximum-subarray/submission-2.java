class Solution {
    public int maxSubArray(int[] nums) {
        
        int cur=0;
        int maxi=nums[0];
        for(int i=0;i<nums.length;i++){
            cur = Math.max(nums[i] , cur+nums[i]);
            maxi=Math.max(maxi,cur);
            
        }

        return maxi;
    }
}

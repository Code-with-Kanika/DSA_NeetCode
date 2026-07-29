class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp= new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int mini= n+1;
            for(int j=i-1;j>=0;j--){
                if(nums[j] + j >= i ){
                    mini= Math.min(mini,dp[j]);
                }
            }
            dp[i] = mini+1;
        }  

        return dp[n-1];


    }
}

class Solution {
    public int maxTurbulenceSize(int[] nums) {
        
        int n=nums.length;
        if(n<2) return n;
        int l=0;
        int prev = Integer.compare(nums[0] , nums[1]);
        
        int ans = (prev==0) ? 1 : 2 ;
       
        if(prev ==0)  l=1;
        for(int r=2;r<n;r++){
            int cur = Integer.compare(nums[r-1] , nums[r]);

            if(cur==0){
                l=r;
                prev = cur;
            }else if(cur * prev == -1){
                prev = cur;
            }else{
                l=r-1;
                prev=cur;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i< n ;i++){
            if (nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            int l=i+1;
            int r=n-1;
            while(l<r){
                if(nums[i] + nums[l] + nums[r] == 0){
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l+=1;
                    r-=1;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }else if(nums[i] + nums[l] + nums[r] < 0){
                    l+=1;
                }else{
                    r-=1;
                }
            }
        }
        return res;
    }
}

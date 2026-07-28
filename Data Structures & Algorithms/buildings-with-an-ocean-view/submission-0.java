class Solution {
    public int[] findBuildings(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n =nums.length;
        ans.add(n-1);
        int maxSoFar= nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i] > maxSoFar){
                ans.add(i);
            }
            maxSoFar = Math.max(maxSoFar , nums[i]);
        }

        int[] res = new int[ans.size()];
        int k=0;
        for(int i=ans.size()-1; i>=0;i--){
            res[k++] = ans.get(i);
        }
        return res;
    }
}
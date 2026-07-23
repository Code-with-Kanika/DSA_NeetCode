class Solution {
    public int maxArea(int[] heights) {

        int maxi = 0;
        int l=0;
        int r=heights.length -1;

        while(l<r){
            int  minHeight = Math.min(heights[l],heights[r]);
            int currArea = minHeight * (r-l) ;
            maxi = Math.max(maxi,currArea);
            
            if(heights[l]<heights[r]){
                l+=1;
            }else{
                r-=1;
            }

            // while(heights[l] < minHeight){
            //     l+=1;
            // }
            // while(heights[r]<minHeight){
            //     r-=1;
            // }

        }
        return maxi;
        
    }
}

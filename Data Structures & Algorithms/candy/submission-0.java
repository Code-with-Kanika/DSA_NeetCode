
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0) return 0;
        
        int[] cand = new int[n];
        // Requirement 1: Each child must have at least one candy
        Arrays.fill(cand, 1);
        
        // Pass 1: Check left neighbor
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                cand[i] = cand[i - 1] + 1;
            }
        }
        
        // Pass 2: Check right neighbor
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                cand[i] = Math.max(cand[i], cand[i + 1] + 1);
            }
        }
        
        // Sum up total candies
        int sumi = 0;
        for (int count : cand) {
            sumi += count;
        }
        
        return sumi;
    }
}

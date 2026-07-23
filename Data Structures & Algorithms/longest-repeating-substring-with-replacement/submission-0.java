class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int maxFreq = 0, l = 0, maxi = 0;
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r) - 'A'] ++ ;
            maxFreq  =Math.max(maxFreq, freq[s.charAt(r) - 'A']);

            while( r-l+1 - maxFreq >k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            maxi = Math.max(maxi , r-l+1);

        }
        return maxi;
    }
}





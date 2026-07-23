class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

 // Window Size = s1.length() to check if all elements of s1 are present in s2
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
            
        
        int matches = 0; //Total Count of Equal values in both hmap1 & hmap2
        for(int i=0;i<26;i++){   // O(26) 
            if (freq1[i] == freq2[i]){
                matches ++ ;
            }
        }
        int l=0;
        for(int r = s1.length() ; r < s2.length(); r++){
            if(matches == 26){
                return true;
            }
            int idx = s2.charAt(r) - 'a' ;
            int val  = freq2[idx] ;
            freq2[idx]++;
            if ( freq2[idx] == freq1[idx] ){
                matches++;
            }else if (val == freq1[idx]){
                matches--;
            }

            int idx2 = s2.charAt(l) - 'a' ;
            val = freq2[idx2];
            freq2[idx2]--;
            if ( freq2[idx2] == freq1[idx2] ){
                matches++;
            }else if(val == freq1[idx2]){
                matches--;
            }
            l++;
        }        
        return matches == 26;
    }
}

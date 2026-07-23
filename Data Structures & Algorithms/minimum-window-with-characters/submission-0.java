class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        int[] targetFreq = new int[128];
        for (char c : t.toCharArray()) {
            targetFreq[c]++;
        }

        int reqd = t.length();
        int l = 0 , r=0, mini =  Integer.MAX_VALUE , start = 0;

         while (r < s.length()) {
            char right = s.charAt(r);
            if(targetFreq[right] >0){
                reqd --;
            }
            targetFreq[right] -=1;
            r++;
            while(reqd ==0 ){
                if(mini > r-l){
                    mini = r-l ;
                    start = l;
                }
                char left = s.charAt(l);
                targetFreq[left] +=1;  
                if(targetFreq[left] >0){
                    reqd ++;
                }                            
                l+=1;
            }
        }
        return mini == Integer.MAX_VALUE ? "" : s.substring(start, start + mini);
    }
}





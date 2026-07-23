class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int r=0;
        int count=0;

        HashSet<Character> hset =new HashSet<Character>();

        while(r < s.length()){
            while(hset.contains(s.charAt(r))){
                hset.remove(s.charAt(l));
                l+=1;
            }
            hset.add(s.charAt(r));
            r+=1;
            count = Math.max(count, r-l);
        }
        return count;
    }
}

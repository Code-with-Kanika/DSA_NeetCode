class Solution {
    public List<Integer> partitionLabels(String s) {
         Map<Character, Integer> hmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hmap.put(s.charAt(i), i);
        }

        List<Integer> res = new ArrayList<>();
        int end=0 , size=0;
        for(int i=0;i<s.length();i++){
            end = Math.max(end , hmap.get(s.charAt(i)));
            size++;
            if(end == i){
                res.add(size);
                size=0;
            }
        }

        return res;
    }
}

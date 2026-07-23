class Solution {

    public String encode(List<String> strs) {
        int n = strs.size();
        String res="";
        for(int i=0;i<n ;i++){
            int l = strs.get(i).length();
            res +=  l + "#" + strs.get(i) ;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<String>();
        int i=0;
        while(i<str.length()){
            int j = i;
            while (str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+len;
            res.add(str.substring(i,j));
            i=j;
        }
        return res;
    }
}

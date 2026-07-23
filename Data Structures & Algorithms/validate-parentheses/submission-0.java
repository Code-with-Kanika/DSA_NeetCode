class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character,Character> hmap = new HashMap<>();
        hmap.put(')','(');
        hmap.put('}','{');
        hmap.put(']','[');

        for (char c : s.toCharArray()) {
            if(hmap.containsKey(c)){
                if(!st.isEmpty() && st.peek()== hmap.get(c) ){
                    st.pop();
                }else{
                    return false;
                }
            }else{
                st.push(c);
            }
        }

        return st.isEmpty();
    }
}





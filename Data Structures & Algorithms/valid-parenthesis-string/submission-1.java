class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> st = new Stack<>();
        Stack<Integer> ast = new Stack<>();
        int count=0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(i);
            }else if(ch == ')'){
                if(!st.isEmpty()) st.pop();
                else if (!ast.isEmpty()) ast.pop();
                else return false;
            }else{
                ast.push(i);
            }
        }

        while(!st.isEmpty() && !ast.isEmpty()){
            if(st.pop() > ast.pop()) return false;
        }
        

        return st.isEmpty();
    }
}

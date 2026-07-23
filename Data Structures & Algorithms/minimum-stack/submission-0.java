// M1: Maintain 2 different stacks - one normal and other to 
// maintain minimum until 
class MinStack {
    long min;
    Stack<Long> st;
    public MinStack() {
        st = new Stack<>();
    }
    public void push(int val) {
        if(st.isEmpty()){
            st.push(0L);
            min=val;
        }else{
            st.push(val-min);
            if(val<min) min = val;
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return ;
        long pop = st.pop();
        if(pop<0) min = min - pop;
    }
    
    public int top() {
        long tp = st.peek();
        if(tp>0){
            return (int) (tp + min);
        }else{
            return (int) min ;
        }
    }
    
    public int getMin() {
        return (int) min;
    }
}

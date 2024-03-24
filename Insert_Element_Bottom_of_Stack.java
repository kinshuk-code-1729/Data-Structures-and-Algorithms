//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> st1 = new Stack<Integer>();
        
        while(!st.isEmpty()){
            int e = st.peek();
            st1.push(e);
            st.pop();
        }
        st.push(x);
        
        while(!st1.isEmpty()){
            int e = st1.peek();
            st.push(e);
            st1.pop();
        }
        
        return st;
    }
}

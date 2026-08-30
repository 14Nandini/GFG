class Solution {
    public int stackMiddle(Stack<Integer> st) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int n = st.size();
        n = n/2;
        for(int i = 0; i < n; i++) stack.push(st.pop());
        return st.peek();
    }
}
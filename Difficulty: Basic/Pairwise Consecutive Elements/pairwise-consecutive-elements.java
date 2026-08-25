class Solution {
    public boolean pairWiseConsecutive(Stack<Integer> st) {
        // code here
        int n = st.size();
        if(n % 2 != 0) st.pop();
        
        while(!st.isEmpty()){
            int curr = st.pop();
            int prev = st.pop();
            if(Math.abs(curr-prev) != 1) return false;
        }
        return true;
    }
}
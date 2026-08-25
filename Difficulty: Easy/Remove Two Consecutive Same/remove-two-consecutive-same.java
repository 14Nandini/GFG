class Solution {
    public int removeConsecutiveSame(String[] arr) {
        
        Stack<String> st = new Stack<>();
        st.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            String str = arr[i];
            if(!st.isEmpty() && st.peek().equals(str)) st.pop();
            else st.push(str);
        }
        return st.size();
    }
};
class Solution {
    public void reverseArray(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        for(int e : arr) st.push(e);
        while(!st.isEmpty()){
            for(int i = 0; i < arr.length; i++) arr[i] = st.pop();
        }
    }
}

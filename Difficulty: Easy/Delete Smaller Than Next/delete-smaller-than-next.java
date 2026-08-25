class Solution {
    public static ArrayList<Integer> deleteElement(int arr[], int k) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int count = 0;
        st.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            while(!st.isEmpty() && st.peek() < arr[i] && count < k){
                st.pop();
                count++;
            }
            st.push(arr[i]);
        }
        while(!st.isEmpty()) al.add(st.pop());
        Collections.reverse(al);
        return al;
    }
}